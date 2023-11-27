import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class createUser {

    private static int savedID;
    private static String uName;

    public static void addUser(Connection connection, user p) throws SQLException {
        String insertSQL = "INSERT INTO users (name, email, password, phoneNo, address, day, month, year) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, p.getName());
            preparedStatement.setString(2, p.getEmail());
            preparedStatement.setString(3, p.getPassword());
            preparedStatement.setString(4, p.getPhoneNumber());
            preparedStatement.setString(5, p.getAddress());
            preparedStatement.setString(6, p.getDay());
            preparedStatement.setString(7, p.getMonth());
            preparedStatement.setString(8, p.getYear());
            preparedStatement.executeUpdate();
        }
    }
    public static boolean checkEmail(Connection connection, String email) throws SQLException{
        String query="SELECT email FROM users";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery(query);
            while (rs.next()) {
                String Email=rs.getString("email");
                if (Email.equals(email)){
                    return true;
                }
            } return false;

        }
    }
    public static boolean checkLogin(Connection connection, String email, String password) throws SQLException {
        String query="SELECT ID, email, password, name from users";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery(query);
            while (rs.next()) {
                savedID = rs.getInt("ID");
                uName = rs.getString("name");
                String Email = rs.getString("email");
                String Password = rs.getString("password");
                if(Email.equals(email) || Password.equals(password)) {
                    return true;
                }
            } return false;
        }
    }
    public static int getSavedID() {
        return savedID;
    }
    public static String getUName() {
        return uName;
    }
    public static void addPoints(Connection connection, int p) {

        String query="UPDATE 'users' set 'points' = ? WHERE ID = " + createUser.getSavedID();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1,p);
            preparedStatement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }




}
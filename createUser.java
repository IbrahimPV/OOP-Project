import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class createUser {


    public static void addUser(Connection connection, user p) throws SQLException {
        String insertSQL = "INSERT INTO users (name, email, password, address, day, month, year, userID) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, p.getName());
            preparedStatement.setString(2, p.getEmail());
            preparedStatement.setString(3, p.getPassword());
            preparedStatement.setString(4, p.getAddress());
            preparedStatement.setString(5, p.getDay());
            preparedStatement.setString(6, p.getMonth());
            preparedStatement.setString(7, p.getYear());
            preparedStatement.setString(8, p.getUserID());
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
        String query="SELECT email, password from users";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery(query);
            while (rs.next()) {
                String Email = rs.getString("email");
                String Password = rs.getString("password");
                if(Email.equals(email) || Password.equals(password)) {
                    return true;
                }
            } return false;
        }
    }



}
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class createUser {


    public static void addUser(Connection connection, user p) throws SQLException {
        String insertSQL = "INSERT INTO users (name, email, password, address, day, month, year) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, p.getName());
            preparedStatement.setString(2, p.getEmail());
            preparedStatement.setString(3, p.getPassword());
            preparedStatement.setString(4, p.getAddress());
            preparedStatement.setString(5, p.getDay());
            preparedStatement.setString(6, p.getMonth());
            preparedStatement.setString(7, p.getYear());
            preparedStatement.executeUpdate();
        }
    }
}
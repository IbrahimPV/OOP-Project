import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class userDataBase {
        private static String url = "jdbc:mysql://localhost:3306/userdatabase1";
        private static String username = "root";
        private static String password = "Ib4444";
    
        public static Connection connect() throws SQLException {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("no");
                e.printStackTrace();
            }

            return DriverManager.getConnection(url, username, password);
        }

        public static void createTable(Connection connection) throws SQLException {
            try (Statement statement = connection.createStatement()) {
                String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY," +
                        "name VARCHAR(255) NOT NULL," +
                        "email VARCHAR(255) UNIQUE NOT NULL," +
                        "password VARCHAR(255) NOT NULL," +
                        "address VARCHAR(255) NOT NULL," +
                        "day VARCHAR(255) NOT NULL," +
                        "month VARCHAR(255) NOT NULL," +
                        "year VARCHAR(255) NOT NULL)";
                statement.executeUpdate(createTableSQL);
            }
        }
        
    }


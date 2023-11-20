import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class userDataBase {
        private static String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12663072";
        private static String username = "sql12663072";
        private static String password = "hWq3Isa7QQ";
    
        public static Connection connect() throws SQLException {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return DriverManager.getConnection(url, username, password);
        }
        
    }


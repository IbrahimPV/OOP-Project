import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class userDataBase {
        private static String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12664920";
        private static String username = "sql12664920";
        private static String password = "8wYid7TuxP";
    
        public static Connection connect() throws SQLException {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return DriverManager.getConnection(url, username, password);
        }
        
    }


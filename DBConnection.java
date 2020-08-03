import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;
    private static final String url = "jdbc:postgresql://localhost:5432/NewGardenMenu";
    private static final String user = "postgres";
    private static final String password = "postgres";

    public static Connection getConnection() {
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
        
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Could not open database.");
                System.exit(1);
            }  
        }
        return connection;
    } 
    
   /* private static final String database = "jdbc:derby://localhost:1527/NewGardenMenu";
    private static final String user = "newgarden";
    private static final String password = "22832283";
    
    private static Connection connection;
    

    public static Connection getConnection()
    {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(database, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Could not open database.");
                System.exit(1);
            }
        }
        return connection;
    } */
}

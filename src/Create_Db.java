    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    
    public class Create_Db {
        public static void main(String[] args) {
            // JDBC URL, username, and password of MySQL server
            String url = "jdbc:mysql://localhost:3306/zoo";
            String user = "root";
            String password = "Althaf1738@";
    
            try {
                // Establish a connection
                Connection connection = DriverManager.getConnection(url, user, password);
                System.out.println("Databse connected successfully");
                // Your code to interact with the database goes here
    
                // Close the connection
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    


package AccessData;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    public Connection databaseLink;
    public Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/proyecto01";
        String dbUsername = "root";
        String dbPassword = "Proyecto01";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, dbUsername, dbPassword);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }
}
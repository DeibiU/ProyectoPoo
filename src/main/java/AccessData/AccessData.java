
package AccessData;

import java.sql.*;

public class AccessData {

    private static String URLconection = "jdbc:mysql://localhost:3306/proyecto01";

    private static String userDatabase = "root";

    private static String passwordDataBase = "Proyecto01";



    public static ResultSet getAllUsers(){
        try {
            Connection connection = DriverManager.getConnection(URLconection,userDatabase,passwordDataBase);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from users");

            return resultSet;

        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ResultSet getAllProjects(){
        try {
            Connection connection = DriverManager.getConnection(URLconection,userDatabase,passwordDataBase);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from create_project");

            return resultSet;

        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public static ResultSet getAllUsersFromProjects(){
        try {
            Connection connection = DriverManager.getConnection(URLconection, userDatabase,passwordDataBase);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select user from proyecto01.add_project");

            return resultSet;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ResultSet getAllUsersFromMedia(){
        try {
            Connection connection = DriverManager.getConnection(URLconection, userDatabase,passwordDataBase);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select authorName from proyecto01.create_media");

            return resultSet;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

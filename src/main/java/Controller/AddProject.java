package Controller;

import AccessData.DBConnection;

import java.sql.Connection;
import java.sql.Statement;

public class AddProject {


    public static void addProject(String user, String project, String direccion, String fecha) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO add_project (user, project) VALUES ('";
        String insertFields = user + "','" + project + "')";
        String insertToRegister = insertValues + insertFields;

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            //AddProjectController.registrationMessageLabel.setText("Proyecto guardado");

        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}
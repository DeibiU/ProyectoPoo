package Controller;

import AccessData.DBConnection;

import java.sql.Connection;
import java.sql.Statement;

public class AddProject {


    public static void AddProjectOnClick(String user, String project) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();
        System.out.println("PROBANDO BOTON AddProject");

        String insertValues = "INSERT INTO add_project (user, project) VALUES ('";
        String insertFields = user + "','" + project + "')";
        String insertToRegister = insertValues + insertFields;

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            //AddProjectController.registrationMessageLabel.setText("Proyecto guardado");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
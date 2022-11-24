package Controller;

import AccessData.DBConnection;
import view.CreateProjectController;
import view.SigninController;

import java.sql.Connection;
import java.sql.Statement;

public class CreateProject {

    public static void btnSaveProject(String nombre, String categoria, String direccion, String fecha) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO create_project (direccion, nombre, categoria, fecha) VALUES ('";
        String insertFields = direccion + "','" + nombre + "','" + categoria + "','" + fecha + "')";
        String insertToRegister = insertValues + insertFields;

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            //CreateProjectController.registrationMessageLabel.setText("Proyecto guardado");

        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}
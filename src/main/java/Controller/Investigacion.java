package Controller;

import AccessData.DBConnection;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.Statement;


public class Investigacion {

    public static void btnSave(String txtTitle, String txtCategory, String txtAuthorName, String txtSubtitle, String txtSubject, String txtRepository) throws Exception{
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO add_investigacion (Title , Category, AuthorName, Subtitle, Subject, Repository) VALUES ('";
        String insertFields = txtTitle + "','" + txtCategory + "','" + txtAuthorName + "','" + txtSubtitle + "','" + txtSubject + "','" + txtRepository +  "')";
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
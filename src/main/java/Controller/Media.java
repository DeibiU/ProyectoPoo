package Controller;

import AccessData.DBConnection;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.Statement;


public class Media {

    public static void addMedia(String txtDateofCreation, String address, String authorName) throws Exception{
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO add_research (txtDateofCreation , address, authorName) VALUES ('";
        String insertFields = txtDateofCreation + "','" + address + "','" + authorName +  "')";
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
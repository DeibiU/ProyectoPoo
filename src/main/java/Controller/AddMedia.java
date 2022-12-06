package Controller;

import AccessData.DBConnection;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AddMedia {

    public static void btnCreateMedia(String dateofCreation, String address, String authorName) throws Exception{
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO create_media (dateofCreation , address, authorName) VALUES ('";
        String insertFields = dateofCreation + "','" + address + "','" + authorName +  "')";
        String insertToRegister = insertValues + insertFields;


        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            System.out.println("Imagen guardada");

            //AddProjectController.registrationMessageLabel.setText("Proyecto guardado");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public static void btnBuscarMedia(ActionEvent event) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();



        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar Imagen");

        // Agregar filtros para facilitar la busqueda
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );

        // Obtener la imagen seleccionada
        File imgFile = fileChooser.showOpenDialog(null);
        if (imgFile != null){
            PreparedStatement pstmt = connectDB.prepareStatement("INSERT INTO create_media (media) VALUES(?)");
            //Inserting Blob type
            InputStream in = new FileInputStream("");
            pstmt.setBlob(4, in);
            //Executing the statement
            pstmt.execute();
            System.out.println("Record inserted......");

        }
    }
    public void btnCancelProject() {
    }
}
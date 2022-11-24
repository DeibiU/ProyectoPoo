package Controller;

import AccessData.DBConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class Media {





    public static void btnSave(String fechaCreacion, ArrayList<String> nombreAutor, String direccion) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO users (Fecha Creacion, nombre de Autor, Categoria, Direccion ) VALUES ('";
        String insertFields = fechaCreacion + "','" + nombreAutor + "','" + direccion + "')";
        String insertToRegister = insertValues + insertFields;

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            // SigninController.registrationMessageLabel.setText("Usuario registrado exitosamente");

        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }


}

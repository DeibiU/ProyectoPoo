package Controller;

import AccessData.DBConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class Investigacion {



    public static void btnSave(String titulo, String subtitulo, String categoria, String tema, ArrayList<String> nombreAutor, ArrayList<String> idMedia) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO users ('Titulo', 'Subtitulo', 'Categoria', 'Tema', 'nombreAutor', 'IdMedia') VALUES ('";
        String insertFields = titulo + "','" + subtitulo + "','" + categoria+ "','" + tema  + "','" + nombreAutor +  "','" + idMedia + "')";
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

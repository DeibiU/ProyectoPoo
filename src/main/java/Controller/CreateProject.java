package Controller;

import AccessData.DBConnection;
import view.CreateProjectController;

import java.sql.*;

public class CreateProject {

    public static void btnSaveProject(String nombre, String categoria, String direccion, String fecha, String text) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO create_project (direccion, nombre, categoria, fecha, text) VALUES ('";
        String insertFields = direccion + "','" + nombre + "','" + categoria + "','" + fecha + "','" + text + "')";
        String insertToRegister = insertValues + insertFields;

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            CreateProjectController.registrationMessageLabel.setText("Proyecto guardado");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public static void guardarCambios(String nombre, String text) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB;
        connectNow.getConnection();
       // PreparedStatement ps = null;

        try {
            connectDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto01", "root", "Proyecto01");
            System.out.println("PROBANDO CONEXION");
            String query = "update create_project set text=? where nombre=? ";
            connectDB.prepareStatement(query);
            // create the java mysql update preparedstatement
            PreparedStatement preparedStmt = connectDB.prepareStatement(query);
            preparedStmt.setString(1, text);
            preparedStmt.setString(2, nombre);

            // execute the java preparedstatement
            preparedStmt.executeUpdate();

            connectDB.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}



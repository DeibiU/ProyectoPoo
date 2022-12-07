package Controller;

import AccessData.DBConnection;

import java.sql.Connection;
import java.sql.Statement;


public class AddResearch {





    public static void addResearch(String titulo, String Category, String AuthorName, String Subtitle, String Repository) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();


        String insertValues = "INSERT INTO add_research (Title , Category, AuthorName, Subtitle, Repository) VALUES ('";
        String insertFields = titulo + "','" + Category + "','" + AuthorName + "','" + Subtitle + "','" + Repository + "','" + "')";
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

package Controller;

import AccessData.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import view.HelloApplication;
import view.LoginController;
import view.SigninController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {

    public static String userConnected;
    /*

     * chequea si el nombre usuario y contraseña existen en el registro de usuarios
     * @param username Nombre de usuario ingresado
     * @param password Contraseña ingresada
     * @return retorna un valor booleano como validacion.
     */
    public static boolean verificarPassword(String usernameTextField, String passwordTextField) { //On1
        ResultSet usuario = AccessData.getAllUsers();
        try {
            while (usuario.next()) {
                if (usuario.getString("usuario").equals(usernameTextField) && usuario.getString("password").equals(passwordTextField)) {
                    userConnected = usernameTextField;
                    System.out.println(userConnected);
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Signin.fxml"));
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }



    // función para obtener los valores ingresados en el formularion de iniciar sesion y cambiar de ventana o alertar si los datos son incorrectos

    public boolean btnClickOnLogin(String usuario, String password) throws Exception {

        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();


        String verifyLogin = "SELECT count(1) FROM users WHERE usuario = '" + usuario + "'AND password = '" + password + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {

                    return true; //
                } else {
                    return false;
                }
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
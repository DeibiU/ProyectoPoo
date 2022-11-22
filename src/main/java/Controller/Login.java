package Controller;

import AccessData.AccessData;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.sql.ResultSet;

public class Login {

    public static String userConnected;

    /**
     * chequea si el nombre usuario y contraseña existen en el registro de usuarios
     * @param username Nombre de usuario ingresado
     * @param password Contraseña ingresada
     * @return retorna un valor booleano como validacion.
     */
    public static boolean verificarPassword(String username, String password) { //On1
        ResultSet usuario = AccessData.getAllUsers();
        try{
            while (usuario.next()){
                if (usuario.getString("userName").equals(username) && usuario.getString("password").equals(password)){
                    userConnected = username;
                    return true;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
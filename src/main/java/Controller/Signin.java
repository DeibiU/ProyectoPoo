package Controller;

import AccessData.AccessData;
import AccessData.DBConnection;
import Model.Usuario;
import view.SigninController;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import view.SigninController;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;

public class Signin {
    private static final String passwordFormat = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{6,8}$";
    private static final Pattern passwordPattern = Pattern.compile(passwordFormat);


    /**
     * Ingresa un usuario nuevo a la base de datos, y verificando que el username de este no exista ya.
     *
     * @param nombre   Nombre completo
     * @param apellido Nombre completo
     * @param email Nombre del usuario
     * @param password Contraseña
     * @param foto     Ubicacion de la foto de perfil

    public static void registrarUsuario(String nombre, String apellido, String email, String password, String foto, String edad) {
    if (!verificarUsername(email)) {
    usuario nuevoUsuario = (new usuario(nombre, apellido, email, password, edad));
    AccessData.insertarUsuario(nuevoUsuario.getUsername(), nuevoUsuario.getnombreyApellido(), nuevoUsuario.getPassword(), nuevoUsuario.getFoto());
    SigninController.alertSuccessfullyRegistered();
    } else SigninController.alertUserName();

    }
     */
    /**
     * Verificacion del username ingresado en el registro de que no exista en la base de datos.
     *
     * @param username Nombre del usuario
     * @return booleano
     */
    public static boolean verificarUsername(String username) {
        boolean check = false;
        ResultSet users = AccessData.getAllUsers();
        try {
            while (users.next()) {
                if (users.getString("username").equals(username)) {
                    check = true;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    /*
     * Verificacion de que la contraseña esta en el formato solicitado
     *
     * @param password Contraseña por validar
     * @return booleano
     */

    /*
    public static boolean verificarPassword(String password) {
        if (passwordPattern.matcher(password).matches()) {
            return true;
        } else {
            return false;
        }

    }

     */


    public static void btnSave(String nombre, String apellido, String email, String password, String rol, String edad) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO users (nombre, usuario, email, password, rol, edad) VALUES ('";
        String insertFields = nombre + "','" + apellido + "','" + email + "','" + password + "','" + rol +  "','" +edad + "')";
        String insertToRegister = insertValues + insertFields;

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            SigninController.registrationMessageLabel.setText("Usuario registrado exitosamente");

        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}
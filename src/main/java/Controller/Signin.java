package Controller;

import AccessData.AccessData;
import Model.usuario;
import view.SigninController;
import java.sql.ResultSet;
import java.util.regex.Pattern;

public class Signin {
    private static final String passwordFormat = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{6,8}$";
    private static final Pattern passwordPattern = Pattern.compile(passwordFormat);

    /**
     * Ingresa un usuario nuevo a la base de datos, y verificando que el username de este no exista ya.
     *
     * @param nombreyApellido Nombre completo
     * @param username Nombre del usuario
     * @param password Contraseña
     * @param foto Ubicacion de la foto de perfil
     */
    public static void registrarUsuario (String nombreyApellido, String username, String password, String foto, String text, String s, int i)  {
        if (!verificarUsername(username)) {
            if (verificarPassword(password)){
                usuario nuevoUsuario= (new usuario(nombreyApellido, username, password,foto));
                AccessData.insertarUsuario(nuevoUsuario.getUsername(),nuevoUsuario.getnombreyApellido(),nuevoUsuario.getPassword(),nuevoUsuario.getFoto());
                SigninController.alertSuccessfullyRegistered();
            } else SigninController.alertPasswordInvalid();
        } else SigninController.alertUserName();

    }

    /**
     * Verificacion del username ingresado en el registro de que no exista en la base de datos.
     * @param username Nombre del usuario
     * @return booleano
     */
    public static boolean verificarUsername(String username)  {
        boolean check = false;
        ResultSet users = AccessData.getAllUsers();
        try {
            while(users.next()){
                if (users.getString("username").equals(username)){
                    check = true;
                    break;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return check;
    }

    /**
     * Verificacion de que la contraseña esta en el formato solicitado
     * @param password Contraseña por validar
     * @return booleano
     */
    public static boolean verificarPassword(String password){
        if (passwordPattern.matcher(password).matches()) {
            return true;
        }
        else {
            return false;
        }
    }
}

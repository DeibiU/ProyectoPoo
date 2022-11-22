package view;


import Controller.Login;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {
    @FXML public Button btnSignin;

    @FXML public Button btnLogin;

    @FXML public TextField Username;

    @FXML public TextField Password;


    /**
     * función para obtener los valores ingresados en el formularion de iniciar sesion y cambiar de ventana o alertar si los datos son incorrectos
     */
    public void btnClickLogin() throws IOException {
        if (Controller.Login.verificarPassword(Username.getText(),Password.getText())){
            waitScreen();
        } else {
            alert();
        }
    }


    /**
     * función para cambiar de ventana por la de Registro
     */
     public void btnClickRegistro() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Signin.fxml"));
        Parent root = fxmlLoader.load();
        SigninController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e-> {
            try {
                controlador.btnBacklogin();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Stage myStage = (Stage) this.btnSignin.getScene().getWindow();
        myStage.close();

    }


    /**
     * función para imprimir una alerta en pantalla informando que los datos no coinciden
     */

    public static void alert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("No se pudo iniciar sesión");
        alert.setContentText("Los datos ingresados no coinciden");
        alert.showAndWait();
    }


    /**
     * función para cambiar de ventana por la de espera
     */

    public void waitScreen() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("waitScreen.fxml"));
        Parent root = fxmlLoader.load();
        waitScreenCrontoller controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e-> {
            try {
                controlador.closeWindow();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Stage myStage = (Stage) this.btnLogin.getScene().getWindow();
        myStage.close();

    }




}
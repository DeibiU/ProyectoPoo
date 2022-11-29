package view;


import AccessData.DBConnection;
import Controller.Login;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class LoginController {
    @FXML public Button btnSignin;

    @FXML public Button btnLogin;

    @FXML public TextField usernameTextField;

    @FXML public TextField passwordTextField;
    public Button btnClickOnLogin;



    // función para obtener los valores ingresados en el formularion de iniciar sesion y cambiar de ventana o alertar si los datos son incorrectos

    public void btnClickOnLogin() throws IOException {
        if (Login.verificarPassword(usernameTextField.getText(), passwordTextField.getText())) {
            System.out.println("AL FIN");
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
            Parent root = fxmlLoader.load();
            MenuController controlador = fxmlLoader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> {
                try {
                    controlador.btnBacklogin();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            Stage myStage = (Stage) this.btnSignin.getScene().getWindow();
            myStage.close();


        } else {
            System.out.println("NO SE PUDO CARGAR");
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
     public void solicitarDatos (){
     String usuario = usernameTextField.getText();
     String password = passwordTextField.getText();
     }
     */
}

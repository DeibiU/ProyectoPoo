package view;

import Controller.Signin;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class SigninController {

    @FXML
    public TextField txtName;

    @FXML
    public TextField txtLastname;

    @FXML
    public TextField txtUsername;

    @FXML
    public Button btnLogin;

    @FXML
    public Button btnSave;

    @FXML
    public TextField txtEmail;

    @FXML
    public PasswordField txtPassword;

    @FXML
    public TextField txtEdad;

    @FXML
    public Button btnUpload;

    @FXML
    public Label lblfoto;

    private String foto = "No hay foto";



    /**
     * función para obtener los datos del formulario de registro y enviarlos a Register
     */
    public void crearUser() {
        Signin.registrarUsuario(txtName.getText(), txtLastname.getText(), txtPassword.getText(), txtEmail.getText(),txtEdad.getText(),foto, Integer.parseInt(txtUsername.getText()));
    }


    /**
     * función para abrir el buscador de archivos para seleccionar la foto de perfil
     */
    public void buscarImagen(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar Imagen");

        // Agregar filtros para facilitar la busqueda
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );

        // Obtener la imagen seleccionada
        File imgFile = fileChooser.showOpenDialog(null);
        if (imgFile != null){
            Image ImgCamisa = new Image(new File(imgFile.toString()).toURI().toString());
            ImageView IVcamisa = new ImageView(ImgCamisa);
            IVcamisa.setFitWidth(100);
            IVcamisa.setFitHeight(105);
            lblfoto.setGraphic(IVcamisa);
            foto = imgFile.toString();
        }

    }


    /**
     * función para crear una alerta en pantalla si el nombre de usuario ya se encuentra registrado
     */
    public static void alertUserName(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("El nombre de usuario ya se encuentra registrado");
        alert.showAndWait();
    }



    /**
     * función para crear una alerta en pantalla si la contraseña no cumple con el formato solicitado
     */
    public static void alertPasswordInvalid(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("La contraseña debe ser de 6 caracteres minimo y 16 maximo. Ademas debe estar conformada por una minuscula, una mayucula y un caracter especial");
        alert.showAndWait();
    }


    /**
     * funcion muestra una alerta de que se registro el usuario exitosamente
     */
    public static void alertSuccessfullyRegistered() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("Usted se a registrado existosamente");
        alert.showAndWait();
    }


    /**
     * función para cerrar la ventana de Signin y volver al Login con el boton
     */

    public void btnBacklogin() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }

}

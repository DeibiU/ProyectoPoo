package view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class SigninController implements Initializable {

    @FXML
    public TextField txtName;

    @FXML
    public TextField txtUsuario;

    @FXML
    public Button btnLogin;

    @FXML
    public Button btnSave;

    public Button closeButton;

    @FXML
    public TextField txtEmail;

    public TextField txtRol;

    @FXML
    public PasswordField txtPassword;

    @FXML
    public TextField txtEdad;

    @FXML
    public Button btnUpload;

    @FXML
    public Label lblfoto;

    public static Label registrationMessageLabel;


    private String foto = "No hay foto";

    /**
     * función para obtener los datos del formulario de registro y enviarlos a Register
     *  */

    public void btnSave() throws Exception {
        String nombre = txtName.getText();
        String apellido = txtUsuario.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String rol = txtRol.getText();
        String edad =  txtEdad.getText();
        Controller.Signin.btnSave(nombre, apellido, email, password,rol, edad);
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

    public static void registerButtonOnAction (ActionEvent event){
        registrationMessageLabel.setText ("Usuario registrado");
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



    public void actionPerformed(ActionEvent e){

        alertSuccessfullyRegistered();
    }
    //REVISAR SI EL INITIALIZE ES NECESARIO
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void closeButtonOnAction (ActionEvent event){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
        Platform.exit();
    }
}
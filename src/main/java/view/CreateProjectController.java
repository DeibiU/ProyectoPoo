package view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateProjectController implements Initializable {

    public static Label registrationMessageLabel;
    public TextField text;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtNombre;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnAddMedia;
    @FXML
    private TextField txtCategoria;
    @FXML
    private TextField txtFecha;
    @FXML
    private TextField txtText;
/*
    public CreateProjectController() {
        String direccion = txtDireccion.getText();
        String nombre = txtNombre.getText();
        String categoria = txtCategoria.getText();
        String fecha = txtFecha.getText();
    }
    */


    public void btnCancelProject() {

    }

    public void btnSaveProject() throws Exception {
        String direccion = txtDireccion.getText();
        String nombre = txtNombre.getText();
        String categoria = txtCategoria.getText();
        String fecha = txtFecha.getText();
        String text = txtText.getText();
        System.out.println("PROBANDO BOTON ADDP");
        Controller.CreateProject.btnSaveProject(nombre, categoria, direccion, fecha, text);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void btnAddMedia(ActionEvent event) throws IOException  {
            System.out.println("Probando boton add media");
            FXMLLoader fxmlLoader = new FXMLLoader(Ejecutador.class.getResource("AddMedia.fxml"));
            Parent root = fxmlLoader.load();
            AddMediaController controlador = fxmlLoader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> {
                controlador.btnCancelProject(event);
            });

            Stage myStage = (Stage) this.btnAddMedia.getScene().getWindow();
            myStage.close();

        }

    public void btnCancelOnAction(ActionEvent event) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
        Platform.exit();
    }

    public void guardarCambios(ActionEvent event) throws Exception {
       Controller.CreateProject.guardarCambios(String.valueOf(txtNombre), String.valueOf(txtText));
    }
}

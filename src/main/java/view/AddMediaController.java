package view;

import Controller.AddMedia;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class AddMediaController implements Initializable {

    @FXML
    public TextField txtDateofCreation;

    @FXML
    private TextField Address;

    @FXML
    private TextField AuthorName;

    @FXML
    public Button btnBuscarMedia;

    @FXML
    private Button btnCreateMedia;

    @FXML
    private Button btnCancel;


    public void btnCreateMedia() throws Exception {
        String dateOfCreation = txtDateofCreation.getText();
        String address = Address.getText();
        String authorName = AuthorName.getText();
        AddMedia.btnCreateMedia(dateOfCreation, address, authorName);
    }
    public void btnSaveAuthor(ActionEvent event) {
    }

    public void btnCancelProject(ActionEvent event) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void btnCancelOnAction (ActionEvent event){
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
        Platform.exit();
    }
    public void btnBuscarMedia() throws Exception {
        AddMedia.btnBuscarMedia(new File("src.txt.txt"),new File("dest.txt") );

    }

}

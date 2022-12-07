package view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddProjectController implements Initializable {

    public Button btnCancel;
    @FXML
    private TextField User;

    @FXML
    private TextField Project;

    @FXML
    public Button AddProject;


    public void AddProjectOnClick() throws Exception {
        String user = User.getText();
        String project = Project.getText();
        System.out.println("PROBANDO BOTON ADDP");
        Controller.AddProject.AddProjectOnClick(user, project);
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void btnCancelOnAction(ActionEvent event) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
        Platform.exit();
    }

    public void btnCancel() {
    }
}

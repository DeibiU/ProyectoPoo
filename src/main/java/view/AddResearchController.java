package view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddResearchController {

    @FXML
    public TextField Title;

    @FXML
    public TextField Category;

    @FXML
    public TextField AuthorName;

    @FXML
    public TextField Subtitle;

    @FXML
    public TextField Repository;

    @FXML
    public Button btnSave;

    @FXML
    public Button btnCancel;

    @FXML
    public Button btnAuthorName;

    @FXML
    public Button btnAddMedia;

    public void AddResearchOnClick() throws Exception {
        String title = Title.getText();
        String category = Category.getText();
        String authorname = AuthorName.getText();
        String subtitle = Subtitle.getText();
        String repository = Repository.getText();
        System.out.println("PROBANDO BOTON ADDP");
        Controller.AddResearch.addResearch(title, category, authorname, subtitle, repository);
    }







    public void initialize(URL url, ResourceBundle resourceBundle) {

    }




    public void btnCancelOnAction (ActionEvent event){
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
        Platform.exit();
    }
}
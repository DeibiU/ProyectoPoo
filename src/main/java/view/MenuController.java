package view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    public Button btnCreateProject;

    @FXML
    public Button btnAssignProject;

    public Button btnBackLogin;


    public void btnCreateProjectOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CreateProject.fxml"));
        Parent root = fxmlLoader.load();
        CreateProjectController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e-> {
            controlador.btnCancelProject();
        });

        Stage myStage = (Stage) this.btnCreateProject.getScene().getWindow();
        myStage.close();

    }

    public void btnBacklogin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Login.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();
    }

        public void btnAssignProject() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AddProject.fxml"));
        Parent root = fxmlLoader.load();
        AddProjectController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e-> {
            controlador.btnCancelProject();
        });

        Stage myStage = (Stage) this.btnCreateProject.getScene().getWindow();
        myStage.close();

    }

}
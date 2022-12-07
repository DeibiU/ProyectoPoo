package view;

import Controller.Menu;
import Model.Proyecto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    public Button btnCreateProject;

    @FXML
    public Button btnAddProject;

    @FXML
    private TextField SearchBar;
    @FXML
    private Button buttonSearch;
    @FXML
    public ListView ListViewProyectos;


    public Button btnBackLogin;


    public void btnAddProjectOnAction() throws IOException {
        System.out.println("Probando add project");
        FXMLLoader fxmlLoader = new FXMLLoader(Ejecutador.class.getResource("AddProject.fxml"));
        Parent root = fxmlLoader.load();
        AddProjectController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e -> {
            controlador.btnCancel();
        });

        Stage myStage = (Stage) this.btnCreateProject.getScene().getWindow();
        myStage.close();

    }

    public void btnCreateProjectOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ejecutador.class.getResource("CreateProject.fxml"));
        Parent root = fxmlLoader.load();
        CreateProjectController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e -> {
            controlador.btnCancelProject();
        });

        Stage myStage = (Stage) this.btnCreateProject.getScene().getWindow();
        myStage.close();

    }

    public void btnEstadisticasOnAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ejecutador.class.getResource("Statistics.fxml"));
        Parent root = fxmlLoader.load();
        StatiticsController controlador = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(e -> {
            controlador.btnExit(new ActionEvent());
        });

        Stage myStage = (Stage) this.btnCreateProject.getScene().getWindow();
        myStage.close();

    }



    public void btnBacklogin() {
    }

    public static ArrayList<Proyecto> proyectos = Menu.getProject();

    public void btnSearch() {
        System.out.println("PROBANDO");
        for (int i = 0; i <= proyectos.size() - 1; i++) {
            if (proyectos.get(i).toString().toLowerCase().contains(SearchBar.getText().toLowerCase())) {

                System.out.println("Probando el if");
                ListViewProyectos.getItems().add(proyectos.get(i).toString());
            }
        }
    }
}
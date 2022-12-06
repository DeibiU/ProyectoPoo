package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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
    private VBox VBResultados;

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

        stage.setOnCloseRequest(e-> {
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

        stage.setOnCloseRequest(e-> {
            controlador.btnCancelProject();
        });

        Stage myStage = (Stage) this.btnCreateProject.getScene().getWindow();
        myStage.close();

    }



    public void btnBacklogin() {
    }

/*  UN TOQUE YA ME VOY
 public void searchButton() throws SQLException {
        VBResultados.getChildren().clear();
        direccion = new ArrayList<>();
         ResulSet resultados = Search.getProject();
      
        int count = 0;
        while (resultados.next()){
            if (resultados.getString("name").toLowerCase().contains(SearchBar.getText().toLowerCase()) || resultados.getString("category").toLowerCase().contains(SearchBar.getText().toLowerCase())){
                resultados.add(Proyecto.getString("ubicacion"));

                HBox HBResultado = new HBox();
                Insets insets = new Insets(20);
                HBResultado.setPadding(insets);
                HBResultado.setMinHeight(110);
                HBResultado.setMinWidth(600);

                MediaView MVvideo = new MediaView();
                MVvideo.setFitHeight(100);
                MVvideo.setFitWidth(200);
                Media media = new Media(new File(videos.getString("ubicacion")).toURI().toString());
                MediaPlayer MPvideo = new MediaPlayer(media);
                MVvideo.setMediaPlayer(MPvideo);
                MPvideo.play();
                MPvideo.setVolume(0);

                Label title = new Label();
                title.setText(videos.getString("name"));
                title.setMinWidth(200);
                title.setAlignment(Pos.CENTER);
                title.setPadding(insets);

                Label category = new Label();
                category.setText(videos.getString("category"));
                category.setMinWidth(200);
                category.setAlignment(Pos.CENTER);
                category.setPadding(insets);

                Label description = new Label();
                description.setText(videos.getString("description"));
                description.setMinWidth(200);
                description.setAlignment(Pos.CENTER);
                description.setPadding(insets);

                Button BTNplay = new Button();
                BTNplay.setText("Reproducir");
                BTNplay.setId(String.valueOf(count));
                BTNplay.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        try {
                            changePlayerVideo(Integer.parseInt(BTNplay.getId()),BTNplay);
                        } catch (IOException | SQLException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });

                HBResultado.getChildren().add(MVvideo);
                HBResultado.getChildren().add(title);
                HBResultado.getChildren().add(category);
                HBResultado.getChildren().add(description);
                HBResultado.getChildren().add(BTNplay);
                VBResultado.getChildren().add(HBResultado);
                count++;

            }
        }
    }

 */
}
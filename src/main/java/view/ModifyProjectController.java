package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ModifyProjectController extends CreateProjectController{

    @FXML
    private Button btnDeleteModifyProject;
//FUNCION PARA ADD MEDIA DESDE MODIFICAR
/*

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
 */
}

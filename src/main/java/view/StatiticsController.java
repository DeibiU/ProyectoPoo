
package view;

import Controller.Statitics;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;

public class StatiticsController {

    @FXML public ListView List1;

    @FXML public ListView List2;

    @FXML public Button btnSeeStats;

    @FXML public Button btnExit;


    public static ArrayList<String> statUserProject = Statitics.getUsersFromProjects();
    public static ArrayList<String> statUserMedia = Statitics.getUsersFromMedia();
    public static HashMap<String, Integer> mapaProject = new HashMap<>();
    public static HashMap<String, Integer> mapaMedia = new HashMap<>();

    public void btnLoadStats() {
        mapaProject.put(statUserProject.get(0), 1);
        int indexNumber;

        for (int i = 1; i <= statUserProject.size() - 1; i++) {
            if (!mapaProject.containsKey(statUserProject.get(i))) {
                mapaProject.put(statUserProject.get(i), 1);
            }else{
                indexNumber = mapaProject.get(statUserProject.get(i));
                mapaProject.put(statUserProject.get(i), indexNumber + 1);
            }
        }
        System.out.println("PROBANDO ESTADISTICAS");
        List1.getItems().add(mapaProject.toString());

        ///////////////////////////////////////////////////////

        mapaMedia.put(statUserMedia.get(0), 1);
        int indexNumber2 = 0;
        for (int j = 1; j <= statUserMedia.size() - 1; j++) {
            if (!mapaMedia.containsKey(statUserMedia.get(j))) {
                mapaMedia.put(statUserMedia.get(j), 1);
            }else{
                indexNumber2 = mapaMedia.get(statUserMedia.get(j));
                mapaMedia.put(statUserMedia.get(j), indexNumber2 + 1);
            }
        }
        List2.getItems().add(mapaMedia.toString());
    }







    public  void btnExit(ActionEvent event){
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
        Platform.exit();
    }
}


package Controller;


import AccessData.DBConnection;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
public class AddMedia {

    public static void btnCreateMedia(String dateofCreation, String address, String authorName) throws Exception {
        DBConnection connectNow = new DBConnection();
        Connection connectDB = connectNow.getConnection();

        String insertValues = "INSERT INTO create_media (dateofCreation , address, authorName) VALUES ('";
        String insertFields = dateofCreation + "','" + address + "','" + authorName + "')";
        String insertToRegister = insertValues + insertFields;


        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertToRegister);

            System.out.println("Imagen guardada");

            //AddProjectController.registrationMessageLabel.setText("Proyecto guardado");

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public static void btnBuscarMedia(File src, File dest) throws Exception {


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
        if (imgFile != null) {
            moverFile(imgFile);
        }
    }
        // Guardar
    public static void moverFile(File src) throws IOException {

                {
                    File to = new File("src/main/java/AccessData/Media/" + src.getName());
                    src.renameTo(to);
                    System.out.println("File moved successfully.");
                }
    }
}


     /* public static void btnBuscarMedia(Stage stage) throws Exception {

        final DBConnection[] connectNow = {new DBConnection()};
        final Connection[] connectDB = {connectNow[0].getConnection()};

        BorderPane bp = new BorderPane();
        Scene scene = new Scene(bp,800,600);

        ImageView imgView = new ImageView();//setting imageview where we will set our uploaded picture before taking it to the database
        imgView.setFitWidth(200);
        imgView.setFitHeight(200);

        //creating button to help us upload our photo
        Button uploadB = new Button("Upload");

        bp.setBottom(uploadB);//placing our upload button on the button of our borderpane
        bp.setCenter(imgView);//placing our imageview at the center of our borderpane

        //setting the upload action for our photo
        uploadB.setOnAction((ActionEvent t) -> {
            FileChooser fc = new FileChooser();
            FileChooser.ExtensionFilter ext1 = new FileChooser.ExtensionFilter("JPG files(*.jpg)","*.JPG");
            FileChooser.ExtensionFilter ext2 = new FileChooser.ExtensionFilter("PNG files(*.png)","*.PNG");
            fc.getExtensionFilters().addAll(ext1,ext2);
            File file = fc.showOpenDialog(stage);

            BufferedImage bf;
            try {
                bf = ImageIO.read(file);
                Image image = SwingFXUtils.toFXImage(bf, null);
                imgView.setImage(image);
                FileInputStream fin = new FileInputStream(file);
                int len = (int)file.length();
                Class.forName("com.mysql.jdbc.Driver");
                connectDB[0] = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto01");
                PreparedStatement pstmt = connectDB[0].prepareStatement("INSERT INTO create_media (media) VALUES(?)");
                pstmt.setBinaryStream(1,fin,len);
                int status = pstmt.executeUpdate();
                if(status>0)
                {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText("Information dialog");
                    alert.setContentText("Photo saved successfully");
                    alert.showAndWait();

                }
                else
                {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Dialog.");
                    alert.setHeaderText("Error Information");
                    alert.showAndWait();
                }
                connectDB[0].close();
            } catch (IOException ex) {
                Logger.getLogger(AddMedia.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddMedia.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddMedia.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        stage.setScene(scene);
        stage.setTitle("Insert Image Into Database");
        stage.show();
    }
    */



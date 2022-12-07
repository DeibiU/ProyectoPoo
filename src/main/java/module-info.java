module com.example.proyectojuanpa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires commons.io;


    opens view to javafx.fxml;
    exports view;
}
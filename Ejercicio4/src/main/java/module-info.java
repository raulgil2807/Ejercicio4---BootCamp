module com.openbootcamp.ejercicio4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.openbootcamp.ejercicio4 to javafx.fxml;
    exports com.openbootcamp.ejercicio4;
}
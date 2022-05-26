module com.example.ejerciciosprimerparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciosprimerparcial to javafx.fxml;
    exports com.example.ejerciciosprimerparcial;
}
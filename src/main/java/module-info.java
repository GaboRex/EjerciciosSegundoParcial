module com.example.ejerciciossegundoparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciossegundoparcial to javafx.fxml;
    exports com.example.ejerciciossegundoparcial;
}
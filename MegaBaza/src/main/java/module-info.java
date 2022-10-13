module com.example.megabaza {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.megabaza to javafx.fxml;
    exports com.example.megabaza;
}
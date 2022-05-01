module com.example.java09 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java09 to javafx.fxml;
    exports com.example.java09;
    exports com.example.java9;
    opens com.example.java9 to javafx.fxml;
}
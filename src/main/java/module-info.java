module com.example.thelinker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thelinker to javafx.fxml;
    exports com.example.thelinker;
}
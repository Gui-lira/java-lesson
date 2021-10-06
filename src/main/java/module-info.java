module com.example.firstlesson {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstlesson to javafx.fxml;
    exports com.example.firstlesson;
}
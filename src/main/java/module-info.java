module com.example.javaanalyzer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaanalyzer to javafx.fxml;
    exports com.example.javaanalyzer;
    exports com.example.javaanalyzer.gui.controllers;
    opens com.example.javaanalyzer.gui.controllers to javafx.fxml;
    exports com.example.javaanalyzer.gui.control;
}
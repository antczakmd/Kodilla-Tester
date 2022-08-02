module com.kodilla.kodilaintro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.kodilaintro to javafx.fxml;
    exports com.kodilla.kodilaintro;
}
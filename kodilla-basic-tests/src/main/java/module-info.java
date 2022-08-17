module com.kodilla.kodillabasictests {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.kodillabasictests to javafx.fxml;
    exports com.kodilla.kodillabasictests;
}
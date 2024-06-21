module com.assignment1.assignment1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.assignment1.assignment1 to javafx.fxml;
    exports com.assignment1.assignment1;
}
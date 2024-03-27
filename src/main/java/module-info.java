module com.ttdat.ourchatapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ttdat.ourchatapp to javafx.fxml;
    exports com.ttdat.ourchatapp;
}
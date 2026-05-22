module com.example.dsa_comeback {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.dsa_comeback to javafx.fxml;
    exports com.example.dsa_comeback;
}
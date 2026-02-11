module com.ahlenius.afm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ahlenius.afm to javafx.fxml;
    exports com.ahlenius.afm;
}
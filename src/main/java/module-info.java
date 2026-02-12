module com.ahlenius.afm {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;


    opens com.ahlenius.afm to javafx.fxml;
    exports com.ahlenius.afm;
    exports com.ahlenius.afm.entitys;
    opens com.ahlenius.afm.entitys to javafx.fxml;
}
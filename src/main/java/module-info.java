module com.nebrora.radiant.radiant {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nebrora.radiant.radiant to javafx.fxml;
    exports com.nebrora.radiant.radiant;
}
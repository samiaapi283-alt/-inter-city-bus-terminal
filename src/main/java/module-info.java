module com.example.intercitybusterminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intercitybusterminal to javafx.fxml;
    opens com.example.intercitybusterminal.Maintenance_Staff to javafx.fxml, javafx.base;
    opens com.example.intercitybusterminal.Passenger to javafx.fxml, javafx.base;
    exports com.example.intercitybusterminal;
}
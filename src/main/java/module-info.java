module com.example.intercitybusterminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intercitybusterminal to javafx.fxml;
    exports com.example.intercitybusterminal;
}
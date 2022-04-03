module com.example.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.jetbrains.annotations;

    opens com.example.calculator to javafx.fxml;
    exports com.example.calculator;
}
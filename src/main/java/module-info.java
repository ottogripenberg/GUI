module com.example.gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens com.example.gui to javafx.fxml;
    exports com.example.gui;
}
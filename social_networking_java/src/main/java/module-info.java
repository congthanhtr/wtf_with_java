module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
//    exports com.example.demo.dashboard;
//    opens com.example.demo.dashboard to javafx.fxml;
}
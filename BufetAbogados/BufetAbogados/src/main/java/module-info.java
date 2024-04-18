module com.itandegui.bufetabogados {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.itandegui.bufetabogados to javafx.fxml;
    exports com.itandegui.bufetabogados;
    exports com.itandegui.bufetabogados.controllers;
    opens com.itandegui.bufetabogados.controllers to javafx.fxml;
}
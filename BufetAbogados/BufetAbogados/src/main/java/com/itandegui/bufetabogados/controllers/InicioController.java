package com.itandegui.bufetabogados.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import com.itandegui.bufetabogados.models.Casos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import com.itandegui.bufetabogados.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class InicioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea Buscartex;

    @FXML
    private Button Buscar;

    @FXML
    private Button ver;

    @FXML
    private Button agregar;

    @FXML
    void onClickBuscar(MouseEvent event) {

    }

    @FXML
    void onClickagregar(MouseEvent event) {
        HelloApplication.newStage("agregar-view","AGREGAR");
    }

    @FXML
    void initialize() {
        assert Buscartex != null : "fx:id=\"Buscartex\" was not injected: check your FXML file 'inicio-view.fxml'.";
        assert Buscar != null : "fx:id=\"Buscar\" was not injected: check your FXML file 'inicio-view.fxml'.";
        assert ver != null : "fx:id=\"ver\" was not injected: check your FXML file 'inicio-view.fxml'.";
        assert agregar != null : "fx:id=\"agregar\" was not injected: check your FXML file 'inicio-view.fxml'.";

    }
}

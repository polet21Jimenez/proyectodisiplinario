package com.itandegui.bufetabogados.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.itandegui.bufetabogados.HelloApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class InicioPaguinaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SALIR;

    @FXML
    private Button InicioSecion;

    @FXML
    private Button Registrarse;

    @FXML
    void onClickInicioSecion(MouseEvent event) {
        HelloApplication.newStage("login2-view","INICIO");
    }

    @FXML
    void onClickSALIR(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void onClickregistrarse(MouseEvent event) {
        HelloApplication.newStage("login1-view","REGISTRO");
    }

    @FXML
    void initialize() {
        assert SALIR != null : "fx:id=\"SALIR\" was not injected: check your FXML file 'iniciopagina-view.fxml'.";
        assert InicioSecion != null : "fx:id=\"InicioSecion\" was not injected: check your FXML file 'iniciopagina-view.fxml'.";
        assert Registrarse != null : "fx:id=\"Registrarse\" was not injected: check your FXML file 'iniciopagina-view.fxml'.";

    }
}

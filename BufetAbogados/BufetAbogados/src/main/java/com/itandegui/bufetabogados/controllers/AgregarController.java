package com.itandegui.bufetabogados.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.itandegui.bufetabogados.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import com.itandegui.bufetabogados.models.Casos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AgregarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea nombrecaso;

    @FXML
    private TextArea informacion;

    @FXML
    private TextArea nombreabogado;

    @FXML
    private Button Agregar;

    @FXML
    void onClickAgregar(MouseEvent event) {
        String nombreCaso = nombrecaso.getText();
        String informacionCaso = informacion.getText();
        String nombreAbogado = nombreabogado.getText();

        if (nombreCaso.isEmpty() || informacionCaso.isEmpty() || nombreAbogado.isEmpty()) {

            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, complete todos los campos.");
            alert.showAndWait();
        } else {

            Casos caso = new Casos(nombreCaso, "Tipo de caso", nombreAbogado, informacionCaso);
            HelloApplication.getCasos().add(caso);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Éxito");
            alert.setHeaderText(null);
            alert.setContentText("Caso agregado correctamente.");
            alert.showAndWait();

            nombrecaso.clear();
            informacion.clear();
            nombreabogado.clear();
}


    }
// no se para que sirve
    @FXML
    void initialize() {
        assert nombrecaso != null : "fx:id=\"nombrecaso\" was not injected: check your FXML file 'agregar-view.fxml'.";
        assert informacion != null : "fx:id=\"informacion\" was not injected: check your FXML file 'agregar-view.fxml'.";
        assert nombreabogado != null : "fx:id=\"nombreabogado\" was not injected: check your FXML file 'agregar-view.fxml'.";
        assert Agregar != null : "fx:id=\"Agregar\" was not injected: check your FXML file 'agregar-view.fxml'.";

    }
}

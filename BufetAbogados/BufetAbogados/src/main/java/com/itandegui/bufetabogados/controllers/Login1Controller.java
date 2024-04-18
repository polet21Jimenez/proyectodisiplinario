package com.itandegui.bufetabogados.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.itandegui.bufetabogados.models.Abogado;
import com.itandegui.bufetabogados.models.Pasante;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import com.itandegui.bufetabogados.models.Casos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import com.itandegui.bufetabogados.models.Usuarios;

public class Login1Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField NumeroTelefono;

    @FXML
    private TextField Usuario;

    @FXML
    private TextField Contraseña;

    @FXML
    private TextField TipoUsuario;

    @FXML
    private Button AgregarUsuario;

    @FXML
    void onClickAgregarUsuario(MouseEvent event) {
        try {
            int telefono = Integer.parseInt(NumeroTelefono.getText());
            String nombre = Usuario.getText();
            int clave = Integer.parseInt(Contraseña.getText());
            String tipoUsuario = TipoUsuario.getText();

            if (tipoUsuario.equals("Pasante")) {
                Pasante pasante = new Pasante(telefono, nombre, clave, tipoUsuario);
                Casos.getUsuarios().getClass().cast(pasante);
            } else if (tipoUsuario.equals("Abogado")) {
                Abogado abogado = new Abogado(telefono, nombre, clave, tipoUsuario);
                Casos.getUsuarios().getClass().cast(abogado);
            }

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Éxito");
            alert.setHeaderText(null);
            alert.setContentText("Usuario agregado correctamente.");
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("El número de teléfono o la clave no son válidos.");
            alert.showAndWait();
        }
    }

    @FXML
    void initialize() {
        assert NumeroTelefono != null : "fx:id=\"NumeroTelefono\" was not injected: check your FXML file 'login1-view.fxml'.";
        assert Usuario != null : "fx:id=\"Usuario\" was not injected: check your FXML file 'login1-view.fxml'.";
        assert Contraseña != null : "fx:id=\"Contraseña\" was not injected: check your FXML file 'login1-view.fxml'.";
        assert TipoUsuario != null : "fx:id=\"TipoUsuario\" was not injected: check your FXML file 'login1-view.fxml'.";
        assert AgregarUsuario != null : "fx:id=\"AgregarUsuario\" was not injected: check your FXML file 'login1-view.fxml'.";

    }
}

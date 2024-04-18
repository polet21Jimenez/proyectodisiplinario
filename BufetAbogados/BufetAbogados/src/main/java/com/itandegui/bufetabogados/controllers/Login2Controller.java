package com.itandegui.bufetabogados.controllers;

import com.itandegui.bufetabogados.HelloApplication;
import java.net.URL;
import com.itandegui.bufetabogados.models.Usuarios;
import com.itandegui.bufetabogados.models.Casos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

public class Login2Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField Usuario;

    @FXML
    private PasswordField Contraseña;

    @FXML
    private Button Ingresar;

    @FXML
    void onClickIngresar(MouseEvent event) {
        String usuario = Usuario.getText();
        String contraseña = Contraseña.getText();

        boolean usuarioValido = Casos.getUsuarios().getAbogados().stream()
                .anyMatch(abogado -> {
                    return abogado.getNombre().equals(usuario) && String.valueOf(abogado.getClave()).equals(contraseña);
                });

        usuarioValido |= Casos.getUsuarios().getPasantes().stream()
                .anyMatch(pasante -> pasante.getNombre().equals(usuario) && String.valueOf(pasante.getClave()).equals(contraseña));

        if (usuarioValido) {
            HelloApplication.newStage("inicio-view", "INICIO");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Usuario o contraseña incorrectos.");
            alert.showAndWait();
        }
    }

    @FXML
    void initialize() {
        assert Usuario != null : "fx:id=\"Usuario\" was not injected: check your FXML file 'login2-view.fxml'.";
        assert Contraseña != null : "fx:id=\"Contraseña\" was not injected: check your FXML file 'login2-view.fxml'.";
        assert Ingresar != null : "fx:id=\"Ingresar\" was not injected: check your FXML file 'login2-view.fxml'.";

    }
}

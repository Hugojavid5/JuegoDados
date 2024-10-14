package org.example.juego;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * La clase { HelloController} es un controlador para la interfaz de usuario
 * de una aplicación JavaFX. Maneja la interacción del usuario y actualiza
 * los elementos de la interfaz, en este caso, un mensaje de bienvenida.
 *
 * @author colegz
 */
public class HelloController {

    /**
     * El texto de bienvenida que se mostrará en la interfaz de usuario.
     */
    @FXML
    private Label welcomeText;

    /**
     * Este método se invoca cuando se hace clic en el botón "Hello".
     * Cambia el texto del {@code welcomeText} para mostrar un mensaje de bienvenida.
     */
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}

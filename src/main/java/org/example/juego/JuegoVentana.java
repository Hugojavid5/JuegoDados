package org.example.juego;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clase JuegoVentana donde mostramos el juego
 */
public class JuegoVentana extends Application {
    private Juego juego;
    private Label vidasJugador1;
    private Label vidasJugador2;

    @Override
    public void start(Stage stage) {
        Personajes jugador1 = new Personajes("Jugador 1");
        Personajes jugador2 = new Personajes("Jugador 2");
        juego = new Juego(jugador1, jugador2);

        // Inicializamos las etiquetas de vidas
        vidasJugador1 = new Label(jugador1.getNombre() + ": " + jugador1.getVidas());
        vidasJugador2 = new Label(jugador2.getNombre() + ": " + jugador2.getVidas());

        // Botón para jugador 1
        Button btn_tj1 = new Button("Tirar dados Jugador 1");
        btn_tj1.setOnAction(e -> {
            juego.jugarTurno(jugador1);  // Aquí debe ser jugador1
            actualizarPuntajes();
        });

        // Botón para jugador 2
        Button btn_tj2 = new Button("Tirar dados Jugador 2");
        btn_tj2.setOnAction(e -> {
            juego.jugarTurno(jugador2);  // Aquí debe ser jugador2
            actualizarPuntajes();
        });

        VBox root = new VBox();
        root.getChildren().addAll(vidasJugador1, btn_tj1, vidasJugador2, btn_tj2);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Juego Dados");
        stage.show();
    }

    /**
     * Actualiza las vidas de los jugadores en la interfaz
     */
    private void actualizarPuntajes() {
        vidasJugador1.setText(juego.jugador1.getNombre() + ": " + juego.jugador1.getVidas());
        vidasJugador2.setText(juego.jugador2.getNombre() + ": " + juego.jugador2.getVidas());
    }

    /**
     * Clase main que sirve como lanzador
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}
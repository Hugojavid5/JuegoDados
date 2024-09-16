package org.example.juego;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

/**
 * Clase principal donde se muestra el juego
 */
public class JuegoVentana extends Application {
    private PersonajePrincipal jugador = new PersonajePrincipal("Jugador", 3);
    private Enemigo enemigo = new Enemigo("Enemigo", 3);
    private Random random = new Random();

    @Override
    public void start(Stage primaryStage) {
        Label jugadorLabel = new Label("Vidas del Jugador: " + jugador.getVidas());
        Label enemigoLabel = new Label("Vidas del Enemigo: " + enemigo.getVidas());
        Label resultLabel = new Label("Presiona 'Tirar Dados' para comenzar");

        Button rollButton = new Button("Tirar Dados");
        rollButton.setOnAction(e -> {
            int dadoJugador = rollDice();
            int dadoEnemigo = rollDice();
            String textoResultado;

            if (dadoJugador < dadoEnemigo) {
                jugador.restarVida();
                textoResultado = String.format("El Jugador sacó %d y pierde una vida. El Enemigo sacó %d.", dadoJugador, dadoEnemigo);
            } else if (dadoEnemigo < dadoJugador) {
                enemigo.restarVida();
                textoResultado = String.format("El Enemigo sacó %d y pierde una vida. El Jugador sacó %d.", dadoEnemigo, dadoJugador);
            } else {
                textoResultado = String.format("Ambos sacaron %d. ¡Es un empate! No se pierde ninguna vida.", dadoJugador);
            }

            resultLabel.setText(textoResultado);
            jugadorLabel.setText("Vidas del Jugador: " + jugador.getVidas());
            enemigoLabel.setText("Vidas del Enemigo: " + enemigo.getVidas());
            checkGameOver();
        });

        VBox vbox = new VBox(10, jugadorLabel, enemigoLabel, rollButton, resultLabel);
        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Juego de Dados");
        primaryStage.show();
    }

    private int rollDice() {
        return random.nextInt(6) + 1; // Número aleatorio entre 1 y 6
    }

    private void checkGameOver() {
        if (!jugador.estaVivo()) {
            System.out.println("¡El Jugador se quedó sin vidas! ¡El Enemigo gana!");
            System.exit(0);
        } else if (!enemigo.estaVivo()) {
            System.out.println("¡El Enemigo se quedó sin vidas! ¡El Jugador gana!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
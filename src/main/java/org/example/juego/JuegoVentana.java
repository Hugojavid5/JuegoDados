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
        Label resultLabel = new Label(" Tira los dados para empezar");

        Button btn_tirar = new Button("Tirar Dados");
        btn_tirar.setOnAction(e -> {
            int dadoJugador = numRandom();
            int dadoEnemigo = numRandom();
            String textoResultado;

            if (dadoJugador < dadoEnemigo) {
                jugador.restarVida();
                textoResultado = String.format("El Jugador sacó "+dadoJugador +" y pierde una vida. El Enemigo sacó "+dadoEnemigo);
            } else if (dadoEnemigo < dadoJugador) {
                enemigo.restarVida();
                textoResultado = String.format("El Enemigo sacó "+dadoEnemigo +" y pierde una vida. El Jugador sacó "+dadoJugador);
            } else {
                textoResultado = String.format("Empate", dadoJugador);
            }

            resultLabel.setText(textoResultado);
            jugadorLabel.setText("Vidas del Jugador: " + jugador.getVidas());
            enemigoLabel.setText("Vidas del Enemigo: " + enemigo.getVidas());
            ganarPerder();
        });

        VBox vbox = new VBox(10, jugadorLabel, enemigoLabel, btn_tirar, resultLabel);
        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Juego de Dados");
        primaryStage.show();
    }

    /**
     * Metodo que devuelve un numero random del 1-6
     * @return
     */
    private int numRandom() {
        return random.nextInt(6) + 1;
    }

    /**
     * Metodo que dice quien gana y quien pierde
     */
    private void ganarPerder() {
        if (!jugador.estaVivo()) {
            System.out.println("¡El Jugador se quedó sin vidas! ¡El Enemigo gana!");
            System.exit(0);
        } else if (!enemigo.estaVivo()) {
            System.out.println("¡El Enemigo se quedó sin vidas! ¡El Jugador gana!");
            System.exit(0);
        }
    }

    /**
     * Metodo lanzador del programa
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
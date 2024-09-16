package org.example.juego;

import java.util.Random;

/**
 * Clase Juego donde se pasan los jugadores y lanzan los dados
 */
public class Juego {
    public Personajes jugador1;
    public Personajes jugador2;
    private Random random;

    public Juego(Personajes jugador1, Personajes jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.random = new Random();
    }

    /**
     * Metodo que lanza el dado devolviendo un numero al azar entre el 1-6
     * @return
     */
    public int lanzarDado() {
        return random.nextInt(6) + 1;
    }

    /**
     * Metodo que sirve para saber a quien le toca tirar
     * @param jugador
     */
    public void jugarTurno(Personajes jugador) {
        int resultadoDado = lanzarDado();
        jugador.agregarPuntos(resultadoDado);
    }
}

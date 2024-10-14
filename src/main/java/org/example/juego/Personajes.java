package org.example.juego;

/**
 * La clase {Personajes} representa un personaje dentro del juego,
 * que tiene un nombre y un número de vidas.
 * Los personajes pueden perder vidas y verificarse si están vivos.
 *
 * @author HugoJavid
 */
public class Personajes {
    /**
     * El nombre del personaje.
     */
    private String nombre;

    /**
     * El número de vidas que tiene el personaje.
     */
    private int vidas;

    /**
     * Crea un nuevo personaje con el nombre y número de vidas especificados.
     * @param nombre el nombre del personaje
     * @param vidas el número inicial de vidas del personaje
     */
    public Personajes(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }

    /**
     * Devuelve el nombre del personaje.
     * @return el nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el número de vidas restantes del personaje.
     * @return el número de vidas del personaje
     */
    public int getVidas() {
        return vidas;
    }

    /**
     * Resta una vida al personaje si tiene al menos una vida restante.
     */
    public void restarVida() {
        if (vidas > 0) {
            vidas--;
        }
    }

    /**
     * Indica si el personaje aún está vivo (si tiene al menos una vida restante).
     *
     * @return {true} si el personaje tiene más de 0 vidas,
     *         {false} en caso contrario
     */
    public boolean estaVivo() {
        return vidas > 0;
    }
}


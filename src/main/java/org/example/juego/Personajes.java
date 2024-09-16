package org.example.juego;

public class Personajes {
    private String nombre;
    private int vidas;

    public Personajes(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void restarVida() {
        if (vidas > 0) {
            vidas--;
        }
    }

    public boolean estaVivo() {
        return vidas > 0;
    }
}

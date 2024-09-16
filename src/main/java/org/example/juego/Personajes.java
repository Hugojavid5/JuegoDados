package org.example.juego;

public class Personajes  {
    private String nombre;
    public int vidas;

    public Personajes(String nombre) {
        this.nombre = nombre;
        this.vidas = 5;
    }
    public String getNombre() {
        return nombre;
    }

    public int getVidas() {
        return vidas;
    }
    public void agregarPuntos(int puntos) {
        this.vidas += puntos;
    }
}

package org.example.juego;
/**
 * La clase { Enemigo} es una extensión de la clase {@code Personajes}
 * que representa a un enemigo en el juego. Hereda todas las propiedades
 * y métodos de la clase { Personajes}.

 */
public class Enemigo extends Personajes {

    /**
     * Crea un nuevo enemigo con el nombre y número de vidas especificados.
     * @param nombre el nombre del enemigo
     * @param vidas el número inicial de vidas del enemigo
     */
    public Enemigo(String nombre, int vidas) {
        super(nombre, vidas);
    }
}

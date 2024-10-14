package org.example.juego;
/**
 * La clase { PersonajePrincipal} es una extensión de la clase {@code Personajes}
 * que representa al personaje principal en el juego. Hereda todas las propiedades
 * y métodos de { Personajes}.
 */
public class PersonajePrincipal extends Personajes {

    /**
     * Crea un nuevo personaje principal con el nombre y número de vidas especificados.
     * @param nombre el nombre del personaje principal
     * @param vidas el número inicial de vidas del personaje principal
     */
    public PersonajePrincipal(String nombre, int vidas) {
        super(nombre, vidas);
    }
}

package Pokemons;

import Iterfaces.IFuego;
import classAbstrac.Pokemon;

public class Charmander extends Pokemon implements IFuego {
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque Mordisco");
    }

    //Metodos de la Interface
    @Override
    public void atacarBolaFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Bola de Fuego");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Puño de Fuego");
    }
}

package Pokemons;

import Iterfaces.IAgua;
import classAbstrac.Pokemon;

public class Squirtle extends Pokemon implements IAgua {
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque Mordisco");
    }

    //Metodos de la Interface
    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque HidroBomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque Pistola de Agua");
    }
}

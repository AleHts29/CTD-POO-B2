package Pokemons;

import Iterfaces.IElectrico;
import classAbstrac.Pokemon;

public class Pikachu extends Pokemon implements IElectrico {
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");
    }

    //Metodos de la Interface
    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impact Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Puño Trueno");
    }
}

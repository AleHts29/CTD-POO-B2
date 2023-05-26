package classAbstrac;

public  abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected String sexo;
    protected int temporada;
    protected double peso;


    //Definimos los metodos Abs
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}

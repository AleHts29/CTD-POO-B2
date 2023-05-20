import java.util.Date;

public class Largometraje extends Pelicula implements Comparable2{
    private String tema;
    private Integer cantActoresPrincipales;

    public Largometraje(String nombre, String clasificacion, Integer duracion, Date fechaFilmacion, String nombreDirector, String tema, Integer cantActoresPrincipales) {
        super(nombre, clasificacion, duracion, fechaFilmacion, nombreDirector);
        this.tema = tema;
        this.cantActoresPrincipales = cantActoresPrincipales;
    }

    //metodos
    public boolean apt(){
        // logica
    }

    public Integer comparar( Largometraje o){
        //logica
    }
}

import java.util.Date;

public class Corto extends Pelicula{

    private String origen;
    private String clasificacion;


    public Corto(String nombre, String clasificacion, Integer duracion, Date fechaFilmacion, String nombreDirector, String origen, String clasificacion1) {
        super(nombre, clasificacion, duracion, fechaFilmacion, nombreDirector);
        this.origen = origen;
        this.clasificacion = clasificacion1;
    }

    // Metodos
    public boolean apt(){
        //logica
    }
}

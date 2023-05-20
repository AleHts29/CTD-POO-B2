import javax.xml.crypto.Data;
import java.util.Date;

public class Pelicula {
    private Cine cine;

    //atributos
    private String nombre;
    private String clasificacion;
    private Integer duracion;
    private Date fechaFilmacion;
    private String nombreDirector;


    public Pelicula(String nombre, String clasificacion, Integer duracion, Date fechaFilmacion, String nombreDirector) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.fechaFilmacion = fechaFilmacion;
        this.nombreDirector = nombreDirector;
    }

    // Metodos
    public String getNombre(){
       return nombre;
    }
    public void  setNombre( String nombre){
        this.nombre = nombre;
    }

    public String getClasificacion(){
        return clasificacion;
    }
    public void  setNombre( String clasificacion){
        this.clasificacion = clasificacion;
    }

    public Integer getDuracion(){
        return duracion;
    }
    public void  setDuracion( Integer duracion){
        this.duracion = duracion;
    }

    public Date getFechaFilmacion(){
        return fechaFilmacion;
    }
    public void  setFechaFilmacion( Date fechaFilmacion){
        this.fechaFilmacion = fechaFilmacion;
    }

    public String getNombreDirector(){
        return fechaFilmacion;
    }
    public void  setNombreDirector( Date nombreDirector){
        this.nombreDirector = nombreDirector;
    }

    public abstract boolean apt();


}

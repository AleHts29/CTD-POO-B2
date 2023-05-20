public class Parcial extends Examen {

//    atributos
    private Integer unidad;
    private Integer nroIntento;


//    constructor
    public Parcial (String titulo, Double nota, String enunciado, Alumno alumno ){
        super(titulo, nota, enunciado, alumno);
        this.unidad = unidad;
        this.nroIntento = nroIntento;
    }



//    metodos
    public boolean aprobar(){
//        logica
        return getNota()>=4;
    }

    public boolean aprobar(){
//        logica
        return getNota()>=4;
    }
}

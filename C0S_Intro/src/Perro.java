public class Perro {

    private Boolean estaEnAdopcioo;
    private String raza;
    private Integer anioNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private String nombre;
    static private  Integer anioActual;

    public Perro(Boolean estaEnAdopcioo, String raza, Integer anioNacimiento, Double peso, Boolean tieneChip, Boolean estaLastimado, String nombre) {
        this.estaEnAdopcioo = estaEnAdopcioo;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }

    public Integer edad(){
        return anioActual - anioNacimiento;
    }
    public Boolean puedePerderse(){
        return !tieneChip;
    }

    public Boolean puedeAdoptarse(){
        return !estaLastimado && peso > 5.45;
    }

    public static void setAnioActual(Integer anioActual) {
        Perro.anioActual = anioActual;
    }
}

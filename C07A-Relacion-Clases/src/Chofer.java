public class Chofer {
    private  String nombre;
    private String apellido;
    private Auto auto;

    public Chofer(String nombre, String apellido, Auto auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Metodos
    public String verPatente(){
        return auto.getPatente();
    }
}

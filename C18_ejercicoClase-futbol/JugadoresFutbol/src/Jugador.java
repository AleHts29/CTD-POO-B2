public class Jugador {
    //atributos
    private String apellidoNombre;
    private Integer nroCamiseta;
    private String posicion;
    //constructor

    public Jugador(String apellidoNombre, Integer nroCamiseta, String posicion) {
        this.apellidoNombre = apellidoNombre;
        this.nroCamiseta = nroCamiseta;
        this.posicion = posicion;
    }

    //metodos

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(Integer nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}



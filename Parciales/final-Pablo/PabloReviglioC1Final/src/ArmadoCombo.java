public abstract class ArmadoCombo {

    private String nombre;

    private String descripcion;

    public ArmadoCombo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }



    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "Operacion: " + nombre + " precio: " + calcularPrecio();
    }

}

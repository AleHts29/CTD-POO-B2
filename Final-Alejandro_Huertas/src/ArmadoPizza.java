public abstract class ArmadoPizza {

    private String nombre;
    private String descripcion;

    public ArmadoPizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "nombre: " + nombre + " precio: " + calcularPrecio();
    }
}

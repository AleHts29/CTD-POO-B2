public class Cliente {
    private int numero;
    private String nombre;

    public Cliente(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

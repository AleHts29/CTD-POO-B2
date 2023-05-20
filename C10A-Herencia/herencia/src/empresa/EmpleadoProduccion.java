package empresa;

public class EmpleadoProduccion extends Empleado {
    private int tiempoExp;

    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempoExp) {
        super(nombre, apellido, dni);
        this.tiempoExp = tiempoExp;
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de produccion: "+getNombre()+" trabajando");
    }
}

package empresa;

public class EmpleadoMarketing extends Empleado  {
    private String area;

    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de Marketing: "+getNombre()+" trabaja en area: " +area);
    }

    public void trabajar( int horasExtras) {
        System.out.println("Empleado de Marketing: "+getNombre()+" trabaja en area: " +area + " con "+horasExtras+" " +
                "horas extras!");
    }

}

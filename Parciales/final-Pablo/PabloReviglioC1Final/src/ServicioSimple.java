public class ServicioSimple extends ArmadoCombo{

    private Double precio;

    public ServicioSimple(String nombre, String descripcion, Double precio) {
        super(nombre, descripcion);
        this.precio = precio;
    }


    @Override
    public Double calcularPrecio() {
        if (getNombre()=="Colocacion"){
            precio +=0.1*precio;
        }
        return precio;
    }
}

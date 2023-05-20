public class PizzaSimple extends ArmadoPizza {
    private Double precio;
    private Boolean pizzaBig;

    public PizzaSimple(String nombre, String descripcion, Double precio, Boolean pizzaBig) {
        super(nombre, descripcion);
        this.precio = precio;
        this.pizzaBig = pizzaBig;
    }

    @Override
    public Double calcularPrecio() {
        if( pizzaBig){
            return precio*2;
        }
        return precio;
    }
}

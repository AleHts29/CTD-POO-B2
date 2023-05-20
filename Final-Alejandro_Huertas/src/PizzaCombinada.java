import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends ArmadoPizza{

    private List<ArmadoPizza> armadoPizzaList;
    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        armadoPizzaList = new ArrayList<>();
    }

    public void agregarArmadoPizza( ArmadoPizza armadoPizza){armadoPizzaList.add(armadoPizza);}
    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
       // logica --> el precio de una pizza combinada que consiste en el promedio de los precios de cada una de
        // las pizzas que conforman la pizza combinada.

        for (ArmadoPizza pizza : armadoPizzaList) {
            precioTotal += pizza.calcularPrecio();
        }
        precioTotal = precioTotal/armadoPizzaList.size();
        
        return precioTotal;
    }
}

import java.util.ArrayList;
import java.util.List;

public class PizzaLoca {
    private List<ArmadoPizza> pizzasList;

    public PizzaLoca(){
        pizzasList = new ArrayList<>();
    }


    public void agregarPizza(ArmadoPizza pizza){
        pizzasList.add(pizza);
    }

    public void mostrarPizzas(){
        for (ArmadoPizza pizza : pizzasList) {
            System.out.println(pizza);
        }
    }
}

public class ArmadoPizzaFactory {

    public static ArmadoPizzaFactory instance;

    private ArmadoPizzaFactory(){

    }

    public static ArmadoPizzaFactory getInstance() {
        if(instance == null){
            instance = new ArmadoPizzaFactory();
        }
        return instance;
    }

    public ArmadoPizza crearArmadoPizza( String codPizza){
        switch (codPizza){
            case "Muzza":
                return new PizzaSimple("muzzarella", "Pizza de muzzarella", 700.0, false);
            case "Especial":
                return new PizzaSimple("Especial", "Pizza especial", 850.0, false);
            case "Anana":
                return new PizzaSimple("Anana", "Pizza de Anana", 950.0, false);
            case "COMBINADA":
                PizzaCombinada  pizzaCombinada=  new PizzaCombinada("Combinada Loca", "Combinada loca - especial y Anana");
                pizzaCombinada.agregarArmadoPizza(crearArmadoPizza(("Especial")));
                pizzaCombinada.agregarArmadoPizza(crearArmadoPizza(("Anana")));
        }
        return null;
    }


}

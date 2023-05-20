public class ArmadoComboFactory {

    private static ArmadoComboFactory instance;

    private ArmadoComboFactory(){

    }

    public static ArmadoComboFactory getInstance(){
        if (instance == null){
            instance = new ArmadoComboFactory();
        }
        return instance;
    }

    public ArmadoCombo crearArmadoCombo(String codigo) {
        switch (codigo){
            case "VENTA":
                return new ServicioSimple("Venta de aire acondicionado", "venta",65000.00);
            case "COLOCACION":
                return new ServicioSimple("Colocacion","manoObra", 10000.00);
            case "COMBO":
                ComboServicio comboServicio = new ComboServicio("Combo Venta y colocacion", "Venta y coloacion de AA",0.1);
                comboServicio.agregarArmadoCombo(crearArmadoCombo("VENTA"));
                comboServicio.agregarArmadoCombo(crearArmadoCombo("COLOCACION"));
                return comboServicio;
        }
                return null;
    }
}

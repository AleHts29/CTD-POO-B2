public class Test {
    public static void main(String[] args) {

        ArmadoComboFactory factory = ArmadoComboFactory.getInstance();

        EmpresaServicio empresaServicio = new EmpresaServicio();

        empresaServicio.agregarCombo(factory.crearArmadoCombo("VENTA"));
        empresaServicio.agregarCombo(factory.crearArmadoCombo("COLOCACION"));
        empresaServicio.agregarCombo(factory.crearArmadoCombo("COMBO"));

        empresaServicio.mostrarServicio();

    }
}
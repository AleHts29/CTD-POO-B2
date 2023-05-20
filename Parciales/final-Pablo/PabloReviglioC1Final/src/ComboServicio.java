import java.util.ArrayList;
import java.util.List;

public class ComboServicio extends ArmadoCombo{

    private Double descuento;

    private List<ArmadoCombo> armadoComboList;

    public ComboServicio(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        armadoComboList = new ArrayList<>();
    }

    public void agregarArmadoCombo(ArmadoCombo armadoCombo){armadoComboList.add(armadoCombo);}

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (ArmadoCombo armadoCombo : armadoComboList) {
            precioTotal += armadoCombo.calcularPrecio();
        }
        return precioTotal - (precioTotal * descuento);

    }
}

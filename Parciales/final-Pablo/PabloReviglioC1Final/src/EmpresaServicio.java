import java.util.ArrayList;
import java.util.List;

public class EmpresaServicio {

    private List<ArmadoCombo> armadoComboList;

    public EmpresaServicio() {
        armadoComboList = new ArrayList<>();
    }

    public void agregarCombo(ArmadoCombo armadoCombo){armadoComboList.add(armadoCombo);}

    public void mostrarServicio(){
        for (ArmadoCombo armadoCombo : armadoComboList) {
            System.out.println(armadoCombo);
        }

    }

}

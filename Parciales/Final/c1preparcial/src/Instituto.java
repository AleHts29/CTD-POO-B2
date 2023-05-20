import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertasList;

    public Instituto() {
        ofertasList = new ArrayList<>();
    }

    public void agregarOferta(OfertaAcademica ofertaAcademica){
        ofertasList.add(ofertaAcademica);
    }

    public void mostrarOfertasAcademicas(){
        for (OfertaAcademica ofertaAcademica : ofertasList) {
            System.out.println(ofertaAcademica);
        }
    }


}

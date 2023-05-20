import java.util.ArrayList;
import java.util.List;

public class Almacen {

    //parametros
    private List<Producto> productoList;
    private List<Producto> otraLista;

    //Constructor
    public Almacen(){
        productoList = new ArrayList<>();
    }

    //Metodos
    public void agregarProducto(Producto producto){
        productoList.add(producto);
    }

    public Double calcularEspacioNecesario(){
        Double espacioNecesario = 0.0;

        // usar iter para generar el forEach
        for (Producto producto : productoList) {
            espacioNecesario += producto.calcularEspacio();
        }

        return espacioNecesario;
    }
}

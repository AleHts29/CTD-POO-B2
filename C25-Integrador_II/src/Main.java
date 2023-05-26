import absClass.Planta;
import plants.Arbol;
import plants.Arbusto;
import plants.Flor;

public class Main {
    public static void main(String[] args) {

        Flor flor = new Flor("rosa", 45, true, "invierno", "rojos", 9.3, "Amarillo", "rosa", "Primavera");

        flor.saludo();
    }
}
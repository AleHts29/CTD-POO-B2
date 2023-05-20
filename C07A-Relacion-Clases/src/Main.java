public class Main {
    public static void main(String[] args) {

    Auto auto2 = new Auto("DFG123", "VolksWagen", "Polo");
    Chofer chofer = new Chofer("Juan", "Perez", new Auto("ABC123", "VolksWagen", "Polo"));
    Chofer chofer2 = new Chofer("Ana", "Rodriguez", auto2);

    System.out.println("La pantente del auto de " + chofer.getNombre() + " es " + chofer.verPatente());



    }
}
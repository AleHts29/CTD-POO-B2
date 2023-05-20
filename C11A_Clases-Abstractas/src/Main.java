public class Main {
    public static void main(String[] args) {

        Animal animal = new Perro("Homero", 3);

// Aplicamos en concepto de Polimorfismo.
        animal = new Gato("Oriana", 4);

        animal.hacerRuido();
    }
}
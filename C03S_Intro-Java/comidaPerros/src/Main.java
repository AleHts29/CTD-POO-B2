import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar nombre del perro");
        String nombre = scanner.nextLine();

        System.out.println("Ingresar cantidad de comida del perro");
        Double comidaQueRequire = scanner.nextDouble();

        Integer paquetesTotales = cuantosPaquetes(comidaQueRequire);
        System.out.println(nombre + " recibio " + paquetesTotales + " paquetes");

    }

    // Funciones - Metodos
    public static Integer cuantosPaquetes( Double cantidadRequeridaEnPaquetes){
        Integer paquetesTotales = 0;
        Double cantidadTotalEnPaquetes = 0.0;
        Scanner scanner = new Scanner(System.in);

        while (cantidadRequeridaEnPaquetes > cantidadTotalEnPaquetes){
            System.out.println("El perro aun tiene hambre!!");
            System.out.println("Cuanto pesa este paquete??");
            Double pesoPaquete = scanner.nextDouble();
            cantidadTotalEnPaquetes += pesoPaquete;

            paquetesTotales++;
        }
        return paquetesTotales;
    }




}
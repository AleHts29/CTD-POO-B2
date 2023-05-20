public class Main {
    public static void main(String[] args) {
        CajaAhorro ca = new CajaAhorro();
        ca.setCliente(new Cliente(321234, "Alejandro"));
        ca.setSaldo(100);
        ca.cobrarInteres();

        System.out.println(ca);
        System.out.println("Info cuenta: "+ca.informarSaldo());
    }
}
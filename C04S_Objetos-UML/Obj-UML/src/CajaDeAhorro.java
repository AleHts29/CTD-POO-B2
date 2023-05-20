import java.util.Random;

public class CajaDeAhorro {
    private String nombreTitular;
    private Double saldo;
    private Integer CBU;
    private String alias;


    // Constructores
    public CajaDeAhorro(String nombreTitular, Double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        crearCuenta();
    }

    public CajaDeAhorro(String nombreTitular, Double saldo, Integer CBU, String alias) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.CBU = CBU;
        this.alias = alias;
    }

    //Metodos
    private void crearCuenta(){
        int min = 1;
        int max = 10000;
        Random cbuRandom = new Random();

        this.CBU = cbuRandom.nextInt(max + min)+min;
        this.alias = "DB_"+this.nombreTitular;

        System.out.println("Cuenta creada - " +"CBU: "+ CBU + " - alias: "+alias );
    }

    public Double retirar(String nombreTitular, Double monto, Integer CBU, String alias ){
        this.saldo -= monto;
        return this.saldo;
    }

    public Double depositar(String nombreTitular, Double monto, Integer CBU, String alias ){
        this.saldo += monto;
        return this.saldo;
    }

    public Double recibirTransferencia( Double monto, Integer CBU){
        this.saldo += monto;
        System.out.println("Transferencia resivida - monto: $"+ monto+" del CBU: " +CBU);
        return this.saldo;
    }

    public Double enviarTransferencia( Double monto, Integer CBU){
        this.saldo -= monto;
        System.out.println("Transferencia enviada - monto: $"+ monto+" al CBU: " +CBU);
        return this.saldo;
    }
}

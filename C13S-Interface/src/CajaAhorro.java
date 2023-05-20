public class CajaAhorro extends Cuenta{

    public static final double INTERES_CAJA_AHORRO = 1.2;

    @Override
    public void extraer(double monto) {
        if(informarSaldo() <= monto){
            setSaldo(informarSaldo() - monto);
        }
    }

    @Override
    public String toString() {
        return "Caja de Ahorro - Saldo:"+informarSaldo()+" - "+getCliente();
    }

    public void cobrarInteres(){
        setSaldo(informarSaldo()*INTERES_CAJA_AHORRO);
    }
}

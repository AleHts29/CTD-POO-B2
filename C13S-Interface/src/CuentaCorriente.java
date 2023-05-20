public class CuentaCorriente extends Cuenta implements ImpuestoGravable {
    private double descubiertoPermitido;

    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer(double monto) {
        if(informarSaldo()+descubiertoPermitido >= monto){
            setSaldo(informarSaldo()-monto);
        }
    }

    @Override
    public double gravar(double porcentaje) {
        // se debera descontar del saldo el monto del porcentaje que se recibe como parámetro y, además, deberá
        // devolver dicho monto.
        double montoADescontar = getSaldo()*porcentaje;
        setSaldo(getSaldo()-montoADescontar);
        return montoADescontar;
    }
}

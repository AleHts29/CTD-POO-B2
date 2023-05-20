public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double monto){ saldo += monto; }
    public void setSaldo(double monto){ this.saldo = monto; }

    public double getSaldo() {
        return saldo;
    }

    public double informarSaldo(){return saldo;}
    public abstract void extraer(double monto);



}

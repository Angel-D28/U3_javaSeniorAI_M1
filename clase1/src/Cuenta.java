public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la operacion");
        }
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class Cuenta {
    private double saldo;
    private String numeroCuenta;
    private String clave;

    public Cuenta(double saldoInicial, String numeroCuenta, String clave) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
    }

    public void retirar(double monto) throws SaldoInsuficienteException, MontoInvalidoException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la operacion.");
        } 
        if (monto  <=  0){
            throw new MontoInvalidoException("El monto a retirar debe ser válido.");
        }
        saldo -= monto;
    }

    public void transferir(Cuenta cuentaDestino, double monto) throws SaldoInsuficienteException, MontoInvalidoException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la transferencia.");
        }
        if (monto  <=  0){
            throw new MontoInvalidoException("El monto a transferir debe ser válido.");
        }
        this.retirar(monto);
        cuentaDestino.depositar(monto);
    }

    public void depositar(double monto) throws MontoInvalidoException {
        if (monto  <=  0){
            throw new MontoInvalidoException("El monto a depositar debe ser válido.");
        }
        saldo += monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getPassword() {
        return clave;
    }
}

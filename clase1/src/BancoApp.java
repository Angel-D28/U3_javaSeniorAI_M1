public class BancoApp {
    private Cajero cajero;

    public BancoApp() {
        this.cajero = new Cajero();
    }

    public void realizarRetiro(Cuenta cuenta, double monto)throws SaldoInsuficienteException, MontoInvalidoException {
        cajero.procesarRetiro(cuenta, monto);
    }

    public void realizarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto)throws SaldoInsuficienteException, MontoInvalidoException{
        cajero.procesarTransferencia(cuentaOrigen, cuentaDestino, monto);
    }
    public void realizarDeposito(Cuenta cuenta, double monto)throws SaldoInsuficienteException, MontoInvalidoException{
        cajero.procesarDeposito(cuenta, monto);
    }
}

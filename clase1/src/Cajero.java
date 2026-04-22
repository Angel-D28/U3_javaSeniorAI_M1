public class Cajero{
    
    public void procesarRetiro(Cuenta cuenta,double monto)throws SaldoInsuficienteException, MontoInvalidoException{
        cuenta.retirar(monto);
        System.out.println("Retiro exitoso. \nNuevo saldo: " + cuenta.getSaldo());
    }

    public void procesarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) throws SaldoInsuficienteException, MontoInvalidoException {
        cuentaOrigen.transferir(cuentaDestino, monto);
        System.out.println("Transferencia exitosa. \nNuevo saldo en cuenta origen: " + cuentaOrigen.getSaldo());
    }

    public void procesarDeposito(Cuenta cuenta, double monto) throws MontoInvalidoException {
        cuenta.depositar(monto);
        System.out.println("Depósito exitoso. \nNuevo saldo: " + cuenta.getSaldo());
    }
    public void procesarConsultaSaldo(Cuenta cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    } 
}
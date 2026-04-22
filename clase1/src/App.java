import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BancoApp bancoApp = new BancoApp();
        
        Cuenta cuenta = new Cuenta(1000, "1010","1234");
        Cuenta cuenta2 = new Cuenta(500, "2020","5678");
        ServicioAutenticacion authService = new ServicioAutenticacion();

        //caso 1: retiro exitoso
        try {
            authService.autenticar(cuenta, "123");
            bancoApp.realizarRetiro(cuenta, 200.0);
        } catch (SaldoInsuficienteException | MontoInvalidoException | AuthenticationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Caso 2: retiro con monto negativo
        try {
            bancoApp.realizarRetiro(cuenta, -50);
        } catch (SaldoInsuficienteException | MontoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Caso 3: transferencia exitosa
        try {
            bancoApp.realizarTransferencia(cuenta, cuenta2, 100);
        } catch (SaldoInsuficienteException | MontoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
            // Caso 4: transferencia con monto negativo
        try {
            bancoApp.realizarTransferencia(cuenta, cuenta2, -50);
        } catch (SaldoInsuficienteException | MontoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

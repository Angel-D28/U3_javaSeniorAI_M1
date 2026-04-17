import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Cuenta cuenta = new Cuenta(1000);

        try {
            cuenta.retirar(1500);
            System.out.println("Saldo restante: " + cuenta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
            // TODO: handle exception
        }
        //FileReader fr  =  new FileReader("src/archivo.txt");
        //int[] numeros = {1,2,3,4,5};
        //System.out.println(numeros[5]);//ArrayIndexOutOfBoundsException : index 5 out of bounds for length 5


        //int a = 10 /  0; //ArithmeticException : /by zero

        //String nombre = null;
        //System.out.println(nombre.length()); //NullPointerException : Cannot invoke "String.length()" because

        //String numero = "abc";
        //int resultado = Integer.parseInt(numero); //NumberFormatException : For input string: "abc"
        /*
        System.out.print("Ingrese un número: ");
        String textoLeido = sc.nextLine();
        try {
            int numero =  Integer.parseInt(textoLeido);
            System.out.println("El número es: " + numero);
            int resultado = 100 / numero;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el texto a número: " + e.getMessage());
            // TODO: handle exception
        }
        catch (ArithmeticException e) {
            System.out.println("Error en la división: " + e.getMessage());
            // TODO: handle exception
        }
 */
    }
}

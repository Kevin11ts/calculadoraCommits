import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operacion;

        System.out.println("Ingrese su primer número: ");
        num1 = scanner.nextDouble();  

        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación: \n Para sumar digite: + \n Para restar : - \n Para multiplicar digite: * \n Para dividir digite: / ");
        operacion = scanner.next().charAt(0);

       
    }
}

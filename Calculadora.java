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

        switch (operacion) {
            case '+':
                System.out.println("El resultado es: " + sumar(num1, num2));
                break;
            case '-':
                System.out.println("El resultado es: " + restar(num1, num2));
                break;
            case '*':
                System.out.println("El resultado es: " + multiplicar(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("El resultado es: " + dividir(num1, num2));
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        scanner.close();
    }

    // Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

       
    }
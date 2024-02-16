import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num1, num2, resultado;
        char operador;

        System.out.println("Bienvenido a la calculadora");
        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextDouble();
        System.out.print("Ingresa la operación (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        switch(operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }
        
        scanner.close();
        ffffff
    }
}

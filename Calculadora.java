import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        System.out.println("===== CALCULADORA =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.print("Seleccione una opcion: ");
        opcion = teclado.nextInt();
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextDouble();
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: division por cero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            case 5:
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Entrada invalida");
        }
    }
}
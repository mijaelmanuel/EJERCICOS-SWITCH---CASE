import java.util.Scanner;
public class Evaluador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String operador;
        boolean valor1, valor2, resultado;
        System.out.print("Ingrese operador (AND, OR, XOR): ");
        operador = teclado.next().toUpperCase();
        System.out.print("Ingrese primer valor (true/false): ");
        valor1 = teclado.nextBoolean();
        System.out.print("Ingrese segundo valor (true/false): ");
        valor2 = teclado.nextBoolean();
        switch (operador) {
            case "AND":
                resultado = valor1 && valor2;
                System.out.println("Resultado: " + resultado);
                break;
            case "OR":
                resultado = valor1 || valor2;
                System.out.println("Resultado: " + resultado);
                break;
            case "XOR":
                resultado = valor1 ^ valor2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operador invalido");
        }
    }
}
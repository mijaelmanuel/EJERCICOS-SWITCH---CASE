import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double valor, resultado;
        System.out.println("===== CONVERSOR =====");
        System.out.println("1. Metros a kilometros");
        System.out.println("2. Kilometros a metros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("4. Fahrenheit a Celsius");
        System.out.print("Seleccione una opcion: ");
        opcion = teclado.nextInt();
        System.out.print("Ingrese el valor: ");
        valor = teclado.nextDouble();
        switch (opcion) {
            case 1:
                resultado = valor / 1000;
                System.out.println("Resultado: " + resultado + " km");
                break;
            case 2:
                resultado = valor * 1000;
                System.out.println("Resultado: " + resultado + " m");
                break;
            case 3:
                resultado = (valor * 9 / 5) + 32;
                System.out.println("Resultado: " + resultado + " °F");
                break;
            case 4:
                resultado = (valor - 32) * 5 / 9;
                System.out.println("Resultado: " + resultado + " °C");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
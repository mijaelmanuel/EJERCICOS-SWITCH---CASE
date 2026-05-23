import java.util.Scanner;
public class Calificacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra;
        System.out.print("Ingrese una calificacion: ");
        letra = teclado.next().toUpperCase().charAt(0);
        switch (letra) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bueno");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Deficiente");
                break;
            case 'F':
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("Calificacion invalida");
        }
    }
}
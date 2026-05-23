import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu, opcion;
        System.out.println("===== RESTAURANTE =====");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");
        System.out.print("Seleccione una opcion: ");
        menu = teclado.nextInt();
        System.out.println("\n--- SUBMENU ---");
        System.out.println("1. Ver platos");
        System.out.println("2. Ver precios");
        System.out.print("Seleccione una opcion: ");
        opcion = teclado.nextInt();
        switch (menu) {
            case 1:
                switch (opcion) {
                    case 1:
                        System.out.println("Platos de desayuno:");
                        System.out.println("- Pan con cafe");
                        System.out.println("- Jugo con sandwich");
                        break;
                    case 2:
                        System.out.println("Precios desayuno:");
                        System.out.println("Pan con cafe: S/ 5");
                        System.out.println("Jugo con sandwich: S/ 8");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
                break;
            case 2:
                switch (opcion) {
                    case 1:
                        System.out.println("Platos de almuerzo:");
                        System.out.println("- Arroz con pollo");
                        System.out.println("- Lomo saltado");
                        break;
                    case 2:
                        System.out.println("Precios almuerzo:");
                        System.out.println("Arroz con pollo: S/ 12");
                        System.out.println("Lomo saltado: S/ 15");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
                break;
            case 3:
                switch (opcion) {
                    case 1:
                        System.out.println("Platos de cena:");
                        System.out.println("- Sopa");
                        System.out.println("- Ensalada");
                        break;
                    case 2:
                        System.out.println("Precios cena:");
                        System.out.println("Sopa: S/ 10");
                        System.out.println("Ensalada: S/ 9");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
                break;
            default:
                System.out.println("Menu invalido");
        }
    }
}
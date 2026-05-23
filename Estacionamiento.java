import java.util.Scanner;
public class Estacionamiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vehiculo, horas;
        double tarifa = 0, total = 0;
        System.out.println("===== ESTACIONAMIENTO =====");
        System.out.println("1. Moto");
        System.out.println("2. Auto");
        System.out.println("3. Camion");
        System.out.print("Seleccione tipo de vehiculo: ");
        vehiculo = teclado.nextInt();
        System.out.print("Ingrese cantidad de horas: ");
        horas = teclado.nextInt();
        switch (vehiculo) {
            case 1:
                tarifa = 3;
                break;
            case 2:
                tarifa = 5;
                break;
            case 3:
                tarifa = 8;
                break;
            default:
                System.out.println("Tipo de vehiculo invalido");
        }
        if (vehiculo >= 1 && vehiculo <= 3) {
            if (horas > 0) {
                total = tarifa * horas;
                System.out.println("Tarifa total: S/ " + total);
            }
            if (horas <= 0) {
                System.out.println("Horas invalidas");
            }
        }
    }
}
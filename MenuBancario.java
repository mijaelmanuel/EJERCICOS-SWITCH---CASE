import java.util.Scanner;
public class MenuBancario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double saldo = 1000;
        double monto;
        System.out.println("===== MENU BANCARIO =====");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese monto a depositar: ");
                monto = teclado.nextDouble();
                if (monto > 0) {
                    saldo = saldo + monto;
                    System.out.println("Deposito realizado");
                    System.out.println("Nuevo saldo: " + saldo);
                } else {
                    System.out.println("Monto invalido");
                }
                break;
            case 2:
                System.out.print("Ingrese monto a retirar: ");
                monto = teclado.nextDouble();
                if (monto <= 0) {
                    System.out.println("Monto invalido");
                } else {
                    if (monto > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - monto;
                        System.out.println("Retiro realizado");
                        System.out.println("Nuevo saldo: " + saldo);
                    }
                }
                break;
            case 3:
                System.out.println("Saldo actual: " + saldo);
                break;
            case 4:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
import java.util.Scanner;
public class Control {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario;
        System.out.print("Ingrese tipo de usuario: ");
        usuario = teclado.next().toUpperCase();
        switch (usuario) {
            case "ADMIN":
                System.out.println("Acceso total");
                break;
            case "USER":
                System.out.println("Acceso parcial");
                break;
            case "GUEST":
                System.out.println("Solo lectura");
                break;
            default:
                System.out.println("Rol invalido");
        }
    }
}
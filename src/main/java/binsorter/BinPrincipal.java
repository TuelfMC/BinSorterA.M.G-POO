package binsorter;
import binsorter.modelo.Usuario;
import java.util.Scanner;
public class BinPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario jfma123 = new Usuario("jmfa123", "Juan Mejia", "jmejia45", "112233", "Principiante");
        Usuario smr456 = new Usuario("smr456", "Santiago Munera", "smunera70", "334455", "Pincipiante");
        int opcion = 0;
        do {
            System.out.println("***BIENVENIDO A BINSORTER A.M.G.");
            System.out.println("1. Registrarse");
            System.out.println("2. Inicia Sesion");
        } while (opcion != 5);
    }
}

package binsorter;
import binsorter.modelo.usuario;
import java.util.Scanner;
public class BinPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        usuario jfma123 = new usuario("jmfa123", "Juan Mejia", "jmejia45", "112233", "Principiante");
        usuario smr456 = new usuario("smr456", "Santiago Munera", "smunera70", "334455", "Pincipiante");
        int opcion = 0;
        do {
            System.out.println("***BIENVENIDO A BINSORTER A.M.G.");
            System.out.println("1. Registrarse");
            System.out.println("2. Inicia Sesion");
        } while (opcion != 5);
    }
}

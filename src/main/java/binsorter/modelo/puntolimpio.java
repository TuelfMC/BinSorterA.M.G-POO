package binsorter.modelo;

import java.util.Scanner;

public class Puntolimpio {

    private String nombre;
    private String ubicacion;

    public Puntolimpio(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void mostrarInformacion() {
        System.out.println("\n===== PUNTO LIMPIO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
    }

    public void clasificarResiduo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSeleccione el residuo:");
        System.out.println("1. Botella plastica");
        System.out.println("2. Residuo organico");
        System.out.println("3. Servilleta usada");
        System.out.println("4. Pila usada");
        System.out.print("Opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Tipo: Reciclable");
                System.out.println("Depositar en: Caneca blanca");
                break;

            case 2:
                System.out.println("Tipo: Organico");
                System.out.println("Depositar en: Caneca verde");
                break;

            case 3:
                System.out.println("Tipo: No aprovechable");
                System.out.println("Depositar en: Caneca negra");
                break;

            case 4:
                System.out.println("Tipo: Residuo especial");
                System.out.println("Depositar en: Punto de recoleccion de pilas");
                break;

            default:
                System.out.println("Opcion no valida.");
        }
    }
}
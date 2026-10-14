package binsorter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import binsorter.modelo.Contenedor;
import binsorter.modelo.Logro;
import binsorter.modelo.Perfilgam;
import binsorter.modelo.Puntolimpio;
import binsorter.modelo.Rango;
import binsorter.modelo.Registroclasificacion;
import binsorter.modelo.Residuo;
import binsorter.modelo.Usuario;

public class BinPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        // Usuarios de prueba
        Usuario usuario1 = new Usuario(
                "jmfa123", "Juan Mejia", "jmejia45", "112233", "Principiante");
        Usuario usuario2 = new Usuario(
                "smr456", "Santiago Munera", "smunera70", "334455", "Principiante");

        usuarios.add(usuario1);
        usuarios.add(usuario2);

        // Objetos persistentes durante la ejecucion del programa, separados por usuario.
        HashMap<Usuario, Perfilgam> perfiles = new HashMap<>();
        HashMap<Usuario, Logro> logros = new HashMap<>();
        for (Usuario usuario : usuarios) {
            perfiles.put(usuario, new Perfilgam(0, 0, 0));
            logros.put(usuario, new Logro(
                    "Primer reciclaje", "Realizar la primera clasificacion", 1));
        }

        // El punto limpio y el contenedor se reutilizan; no se crean en cada consulta.
        Puntolimpio punto = new Puntolimpio(
                "Punto limpio Unilasallista", "Corporacion Universitaria Lasallista");
        Contenedor contenedor = new Contenedor("Reciclable", 100, 0, false);

        int opcion = 0;
        do {
            System.out.println("\n================================");
            System.out.println("      BINSORTER A.M.G.");
            System.out.println("================================");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");

            if (!scanner.hasNextLine()) {
                opcion = 2;
                break;
            }

            String entradaOpcion = scanner.nextLine().trim();
            try {
                opcion = Integer.parseInt(entradaOpcion);
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un numero.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n===== INICIO DE SESION =====");
                    System.out.print("Correo electronico: ");
                    String correoIngresado = scanner.nextLine();
                    System.out.print("Contraseña: ");
                    String contraseñaIngresada = scanner.nextLine();

                    Usuario usuarioActivo = null;
                    for (Usuario usuario : usuarios) {
                        if (usuario.iniciarSesion(correoIngresado, contraseñaIngresada)) {
                            usuarioActivo = usuario;
                            break;
                        }
                    }

                    if (usuarioActivo == null) {
                        System.out.println("Correo electronico o contraseña incorrectos.");
                        break;
                    }

                    int opcionMenu = 0;
                    do {
                        System.out.println("\n================================");
                        System.out.println("       MENU PRINCIPAL");
                        System.out.println("================================");
                        System.out.println("1. Clasificador de residuos");
                        System.out.println("2. Consultar punto limpio");
                        System.out.println("3. Instrucciones de residuos");
                        System.out.println("4. Mi perfil y progreso");
                        System.out.println("5. Consultar contenedores");
                        System.out.println("6. Consultar logros");
                        System.out.println("7. Cerrar sesion");
                        System.out.print("Seleccione una opcion: ");

                        if (!scanner.hasNextLine()) {
                            usuarioActivo.cerrarSesion();
                            System.out.println("Regresando al menu principal.");
                            opcion = 2;
                            break;
                        }

                        entradaOpcion = scanner.nextLine().trim();
                        try {
                            opcionMenu = Integer.parseInt(entradaOpcion);
                        } catch (NumberFormatException e) {
                            System.out.println("Error: debe ingresar un numero.");
                            continue;
                        }

                        switch (opcionMenu) {
                            case 1:
                                System.out.println("\n===== CLASIFICADOR =====");
                                System.out.print("Ingrese el nombre del residuo: ");
                                String residuoIngresado = scanner.nextLine().trim();

                                if (residuoIngresado.isEmpty()) {
                                    System.out.println("Error: el nombre del residuo no puede estar vacio.");
                                    break;
                                }

                                Registroclasificacion registro =
                                        new Registroclasificacion(residuoIngresado);
                                registro.mostrarRegistro();

                                // Suma puntos y actualiza el contenedor solo si el residuo se reconoce.
                                if (!residuoIngresado.trim().isEmpty()
                                        && (residuoIngresado.equalsIgnoreCase("botella")
                                        || residuoIngresado.equalsIgnoreCase("organico")
                                        || residuoIngresado.equalsIgnoreCase("servilleta")
                                        || residuoIngresado.equalsIgnoreCase("pila"))) {
                                    perfiles.get(usuarioActivo).acumularPuntos(50);
                                    if (!logros.get(usuarioActivo).estaDesbloqueado()) {
                                        logros.get(usuarioActivo).desbloquear();
                                    }
                                    contenedor.actualizarNivel(1);
                                    contenedor.notificarLlenado();
                                }
                                break;

                            case 2:
                                punto.mostrarInformacion();
                                punto.clasificarResiduo(scanner);
                                break;

                            case 3:
                                System.out.println("\n===== INSTRUCCIONES =====");
                                Residuo residuo = new Residuo(
                                        "Botella plastica", "Envase de plastico",
                                        "Caneca blanca", true);
                                residuo.obtenerInstrucciones();
                                break;

                            case 4:
                                System.out.println("\n===== MI PERFIL =====");
                                perfiles.get(usuarioActivo).consultarProceso();
                                break;

                            case 5:
                                System.out.println("\n===== CONTENEDORES =====");
                                contenedor.notificarLlenado();
                                Rango rango = new Rango(
                                        contenedor.getNivelLlenadoActual(),
                                        contenedor.getCapacidadMaxima());
                                rango.mostrarRango();
                                break;

                            case 6:
                                System.out.println("\n===== LOGROS =====");
                                Logro logroUsuario = logros.get(usuarioActivo);
                                if (logroUsuario.estaDesbloqueado()) {
                                    logroUsuario.mostrarInformacion();
                                } else {
                                    System.out.println("Aun no has desbloqueado este logro.");
                                }
                                break;

                            case 7:
                                usuarioActivo.cerrarSesion();
                                System.out.println("Regresando al menu principal.");
                                break;

                            default:
                                System.out.println("Opcion no valida.");
                        }
                    } while (opcionMenu != 7);
                    break;

                case 2:
                    System.out.println("Gracias por utilizar BinSorter A.M.G.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}

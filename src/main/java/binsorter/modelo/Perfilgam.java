package binsorter.modelo;

public class Perfilgam {
    private int puntosTotales;
    private int puntosAcumulados;
    private float totalKgClasificados;

    public Perfilgam(int puntosTotales, int puntosAcumulados, float totalKgClasificados) {
        this.puntosTotales = puntosTotales;
        this.puntosAcumulados = puntosAcumulados;
        this.totalKgClasificados = totalKgClasificados;
    }

    public void acumularPuntos(int puntos) {
        if (puntos > 0) {
            puntosAcumulados += puntos;
            puntosTotales += puntos;
        }
    }

    public void actualizarRango() {
        if (puntosAcumulados >= 1000) {
            System.out.println("Rango: Experto reciclador");
        } else if (puntosAcumulados >= 500) {
            System.out.println("Rango: Reciclador avanzado");
        } else if (puntosAcumulados >= 100) {
            System.out.println("Rango: Reciclador intermedio");
        } else {
            System.out.println("Rango: Reciclador principiante");
        }
    }

    public void consultarProceso() {
        System.out.println("Puntos totales: " + puntosTotales);
        System.out.println("Puntos acumulados: " + puntosAcumulados);
        System.out.println("Total de kg clasificados: " + totalKgClasificados);
        actualizarRango();
    }
}
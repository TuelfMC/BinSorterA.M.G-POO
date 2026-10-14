package binsorter.modelo;

public class Rango {

    private double cantidadActual;
    private double capacidadMaxima;

    public Rango(double cantidadActual, double capacidadMaxima) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String calcularRango() {
        double porcentaje = (cantidadActual / capacidadMaxima) * 100;

        if (porcentaje < 30) {
            return "Bajo";
        } else if (porcentaje < 70) {
            return "Medio";
        } else {
            return "Alto";
        }
    }

    public void mostrarRango() {
        System.out.println("Nivel del contenedor: " + calcularRango());
    }
}

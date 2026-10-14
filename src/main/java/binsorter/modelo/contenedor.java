package binsorter.modelo;

public class Contenedor {
    private String tipoResiduo;
    private double capacidadMaxima;
    private double nivelLlenadoActual;
    private boolean estaLleno;

    public Contenedor(String tipoResiduo, double capacidadMaxima, double nivelLlenadoActual, boolean estaLleno){
        this.tipoResiduo = tipoResiduo;
        this.capacidadMaxima = capacidadMaxima;
        this.nivelLlenadoActual = nivelLlenadoActual;
        this.estaLleno = false;
    }

    public void actualizarNivel(double cantidadkg){
        nivelLlenadoActual += cantidadkg;
        System.out.println("El contenedor se ha llenado con: "+ cantidadkg);
    }
    public void notificarLlenado(){
        estaLleno = (nivelLlenadoActual >= capacidadMaxima);
        if (estaLleno){
            System.out.println("El contenedor esta lleno");
        }
    }
}

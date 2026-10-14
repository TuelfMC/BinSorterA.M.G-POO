package binsorter.modelo;

public class Contenedor {
    private String tipoResiduo;
    private String capacidadMaxima;
    private double nivelLlenadoActual;
    private boolean estaLleno;

    public Contenedor(String tipoResiduo, String capacidadMaxima, double nivelLlenadoActual, boolean estaLleno){
        this.tipoResiduo = tipoResiduo;
        this.capacidadMaxima = capacidadMaxima;
        this.nivelLlenadoActual = nivelLlenadoActual;
        this.estaLleno = False;
    }

    public void actualizarNivel(double cantidadKg){}
    public void notificarLlenado(){}
}

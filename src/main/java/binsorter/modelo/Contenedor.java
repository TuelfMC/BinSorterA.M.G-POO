package binsorter.modelo;

public class Contenedor {
    private int idContenedor;
    private String tipoResiduo;
    private String colorCodigo;
    private String capacidadMaxima;
    private double nivelLlenadoActual;

    public Contenedor(int idContenedor, String tipoResiduo, String colorCodigo, String capacidadMaxima, double nivelLlenadoActual){
        this.idContenedor = idContenedor;
        this.tipoResiduo = tipoResiduo;
        this.colorCodigo = colorCodigo;
        this.capacidadMaxima = capacidadMaxima;
        this.nivelLlenadoActual = nivelLlenadoActual;
    }

    public void actualizarNivel(){}
    public void notificarLlenado(){}
}

package binsorter.modelo;

public class Logro {
    private String titulo;
    private String descripçion;
    private double requisitoKg;

    public Logro(String titulo, String descripcion, double requisitoKg){
        this.titulo = titulo;
        this.descripçion = descripcion;
        this.requisitoKg = requisitoKg;
    }

    public void evaluarCumplimiento(){}
    public void desbloquear(){}
}

package binsorter.modelo;

public class Logro {
    private int idLogro;
    private String titulo;
    private String descripçion;
    private double requisitoKg;

    public Logro(int idLogro, String titulo, String descripcion, double requisitoKg){
        this.idLogro = idLogro;
        this.titulo = titulo;
        this.descripçion = descripcion;
        this.requisitoKg = requisitoKg;
    }

    public void evaluarCumplimiento(){}
    public void desbloquear(){}
}

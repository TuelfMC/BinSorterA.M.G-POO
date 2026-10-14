package binsorter.modelo;

public class Logro {
    private String titulo;
    private String descripçion;
    private double requisitoKg;
    private boolean cantidadActual;

    public Logro(String titulo, String descripcion, double requisitoKg){
        this.titulo = titulo;
        this.descripçion = descripcion;
        this.requisitoKg = requisitoKg;
    }

    public void evaluarCumplimiento(){
        if (cantidadActual == true) {
            desbloquear();
        }
    }

    public void desbloquear(){
        cantidadActual = true;
        System.out.println("¡Logro desbloqueado: " + titulo + "!");
    }
}
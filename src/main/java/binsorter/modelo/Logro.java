package binsorter.modelo;

public class Logro {
    private String titulo;
    private String descripcion;
    private double requisitoKg;
    private boolean cantidadActual;

    public Logro(String titulo, String descripcion, double requisitoKg){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.requisitoKg = requisitoKg;
    }

    public void evaluarCumplimiento(){
        if (cantidadActual == true) {
            desbloquear();
        }
    }

    public boolean estaDesbloqueado() {
        return cantidadActual;
    }

    public void mostrarInformacion() {
        System.out.println("Logro: " + titulo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Requisito: " + requisitoKg + " kg");
    }

    public void desbloquear(){
        cantidadActual = true;
        System.out.println("¡Logro desbloqueado: " + titulo + "!");
    }
}
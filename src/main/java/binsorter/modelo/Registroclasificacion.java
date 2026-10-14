package binsorter.modelo;


public class Registroclasificacion{
    private int idRegistro;
    private double pesoKg;
    private int puntosObtenidos;

    public Registroclasificacion(int idRegistro, double pesoKg, int puntosObtenidos){
        this.idRegistro = idRegistro;
        this.pesoKg = pesoKg;
        this.puntosObtenidos = puntosObtenidos;
    }

    public void calcularPuntos(){}
}

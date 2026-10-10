package binsorter.modelo;

import java.sql.Time;

public class Registroclasificacion{
    private int idRegistro;
    private Time fechaHora;
    private double pesoKg;
    private int puntosObtenidos;

    public Registroclasificacion(int idRegistro, Time fechaHora, double pesoKg, int puntosObtenidos){
        this.idRegistro = idRegistro;
        this.fechaHora = fechaHora;
        this.pesoKg = pesoKg;
        this.puntosObtenidos = puntosObtenidos;
    }

    public void calcularPuntos(){}
    public void generarComprobante(){}
}
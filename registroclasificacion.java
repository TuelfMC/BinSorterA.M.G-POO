
import java.sql.Time;

public class registroclasificacion{
    private int idRegistro;
    private Time fechaHora;
    private double pesoKg;
    private int puntosObtenidos;

    public registroclasificacion(int idRegistro, Time fechaHora, double pesoKg, int puntosObtenidos){
        this.idRegistro = idRegistro;
        this.fechaHora = fechaHora;
        this.pesoKg = pesoKg;
        this.puntosObtenidos = puntosObtenidos;
    }

    public void calcularPuntos(){}
    public void generarComprobante(){}
}
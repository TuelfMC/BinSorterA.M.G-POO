package binsorter.modelo;

public class Rango {
    private int idRango;
    private String nombreRango;
    private int puntosMinimos;
    private int puntosMaximos;

    public Rango(int idRango, String nombreRango, int puntosMinimos, int puntosMaximos){
        this.idRango = idRango;
        this.nombreRango = nombreRango;
        this.puntosMinimos = puntosMinimos;
        this.puntosMaximos = puntosMaximos;
    }

    public void verificarElegibilidad(){}
    public void obtenerBenficios(){}
    
}

package binsorter.modelo;

public class perfilgam {
    private int idPuntuacion;
    private int puntosTotales;
    private int puntosAcumulados;
    private float totalKgClasificados;

    public perfilgam(int idPuntuacion, int puntosTotales, int puntosAcumulados, float totalKgClasificados) {
        this.idPuntuacion = idPuntuacion;
        this.puntosTotales = puntosTotales;
        this.puntosAcumulados = puntosAcumulados;
        this.totalKgClasificados = totalKgClasificados;
    }

    public void acumularPuntos(int puntos){}
    public void actualizarRango(){}
    public void consultarProceso(){}
    

}

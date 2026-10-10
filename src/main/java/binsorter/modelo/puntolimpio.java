package binsorter.modelo;

public class puntolimpio{
    private int idPunto;
    private String ubicacion;
    private String horarioAtencion;
    private String estado;

    public puntolimpio(int idPunto, String ubucacion, String horarioAtencion, String estado){
        this.idPunto = idPunto;
        this.ubicacion = ubucacion;
        this.horarioAtencion = horarioAtencion;
        this.estado = estado;
    }

    public void listarContenedores(){}
    public void verificarCapacidadDisponible(){}
}
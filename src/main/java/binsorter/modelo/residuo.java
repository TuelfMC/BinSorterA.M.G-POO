package binsorter.modelo;

public class residuo {
    private int idResiduo;
    private String nombre;
    private String descripcion;
    private String categoria;
    private boolean esReciclable;

    public residuo(int idResiduo, String nombre,String descripcion, String Categoria, boolean esReciclable){
        this.idResiduo = idResiduo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.esReciclable = esReciclable;
    }

    public void obtenerInstrucciones(){}
    public void validarCategoria(){}
}

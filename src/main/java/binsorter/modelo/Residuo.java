package binsorter.modelo;

public class Residuo {
    private String nombre;
    private String descripcion;
    private String categoria;
    private boolean esReciclable;

    public Residuo(String nombre,String descripcion, String Categoria, boolean esReciclable){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.esReciclable = esReciclable;
    }

    public void obtenerInstrucciones(){}
    public void validarCategoria(){}
}

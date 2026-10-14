package binsorter.modelo;

public class Residuo {
    private String nombre;
    private String descripcion;
    private String categoria;
    private boolean esReciclable;

    public Residuo(String nombre,String descripcion, String categoria, boolean esReciclable){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.esReciclable = esReciclable;
    }

    public void obtenerInstrucciones(){
        if (esReciclable){
            System.out.println("Instrucciones para " + nombre + ": Asegúrate de limpiarlo, secarlo y depositarlo en el contenedor de reciclaje (" + categoria + ").");
        } else {
            System.out.println("Instrucciones para " + nombre + ": Este residuo no es reciclable. Deposítalo en la papelera de residuos ordinarios/no aprovechables.");
        }
    }
    public boolean validarCategoria(String categoriaIngresada) {
        return categoria != null && categoria.equalsIgnoreCase(categoriaIngresada);
}
}

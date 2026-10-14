package binsorter.modelo;

public class Registroclasificacion {

    private String nombreResiduo;
    private String tipoResiduo;
    private String contenedor;

    public Registroclasificacion(String nombreResiduo) {
        this.nombreResiduo = nombreResiduo;
        clasificarResiduo();
    }

    public void clasificarResiduo() {
        if (nombreResiduo.equalsIgnoreCase("botella")) {
            tipoResiduo = "Reciclable";
            contenedor = "Caneca blanca";
        } else if (nombreResiduo.equalsIgnoreCase("organico")) {
            tipoResiduo = "Organico";
            contenedor = "Caneca verde";
        } else if (nombreResiduo.equalsIgnoreCase("servilleta")) {
            tipoResiduo = "No aprovechable";
            contenedor = "Caneca negra";
        } else if (nombreResiduo.equalsIgnoreCase("pila")) {
            tipoResiduo = "Residuo especial";
            contenedor = "Punto de recoleccion de pilas";
        } else {
            tipoResiduo = "Desconocido";
            contenedor = "No identificado";
        }
    }

    public void mostrarRegistro() {
        System.out.println("Residuo: " + nombreResiduo);
        System.out.println("Tipo: " + tipoResiduo);
        System.out.println("Depositar en: " + contenedor);
    }
}
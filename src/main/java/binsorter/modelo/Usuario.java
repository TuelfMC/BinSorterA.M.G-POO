package binsorter.modelo;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String contraseña;
    private String rol;

    public Usuario(String id, String nombre, String email, String contraseña, String rol){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public void iniciarSesion(String email, String contraseña){
        if (this.email.equals(email) && this.contraseña.equals(contraseña)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + nombre);
        } else {
            System.out.println("Correo electrónico o contraseña incorrectos.");
        }
    }

    public void cerrarSesion(){
        System.out.println("Sesión cerrada correctamente.");
    }
}
public class usuario {
    private String id;
    private String nombre;
    private String email;
    private String contraseña;
    private String rol;


    public usuario(String id, String nombre, String email, String contraseña, String rol){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;

    }

    public void registrarse(){}
    public void iniciarSesion(){}
    public void cerrarSesion(){}
    public void editarPerfil(){}
    
}

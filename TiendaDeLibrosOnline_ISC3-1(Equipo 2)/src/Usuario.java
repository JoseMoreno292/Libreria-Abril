public class Usuario {
    /* Creamos el objeto de cliente */

    private String nombre; //Nombre del cliente
    private String email;  //Email del cliente
    private String clave;  //Contraseña del cliente

    /* Constructor del cliente */
    public Usuario(String nombre, String email, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }

}

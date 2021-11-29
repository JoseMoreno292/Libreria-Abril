public class MetodoDePago {
    private String ISBN;
    private String nombre;
    private int CCV;
    private String direccion;
    private String numTargeta;
    private int metodoPago;

    public MetodoDePago(String ISBN){
        this.ISBN = ISBN;
    }

    public MetodoDePago(String nombre, int CCV, String direccion, String numTargeta, int metodoPago) {
        this.nombre = nombre;
        this.CCV = CCV;
        this.direccion = direccion;
        this.numTargeta = numTargeta;
        this.metodoPago = metodoPago;
    }

    public String informacionUsuario() {
        return "\nINFORMACION DEL USUARIO" +
                "Nombre: " + nombre +
                "Direccion: " + direccion;
    }

    public String informacionTargeta() {
        return "\nINFORMACION DE LA TARGETA" +
                "CCV: " + CCV +
                "Numero de targeta: " + numTargeta;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getNombre() {
        return nombre;
    }
}

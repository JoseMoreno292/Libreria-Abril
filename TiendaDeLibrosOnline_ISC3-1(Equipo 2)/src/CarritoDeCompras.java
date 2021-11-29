public class CarritoDeCompras extends CatalogoLibros {
    /*Tiene que heredar de la clase padre Libro
     */

    /* Constructor */

    public CarritoDeCompras(String tituloLibro, double precio, int categoria, String genero) {
        super( tituloLibro, precio, categoria, genero);
    }

    @Override
    public String toString() {
        return super.toString() ;
    }


    /* Metodo get para poder utilizar el ISBN */


    /* toString para mandar a imprimir los datos */

}

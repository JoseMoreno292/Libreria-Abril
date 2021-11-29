public class CatalogoLibros {
    private String tituloLibro; //Nombre del libro
    private double precio; // Precio del libro
    private int categoria; //Categoria (Libros, Libros digitales, Mas vendidos, Comics)
    private String ISBN; // ISBN del libro
    private String genero; // Genero del libro
    private int numPaginas; // Numero de paginas

    public CatalogoLibros( String tituloLibro, double precio, int categoria, String genero) {
        this.tituloLibro = tituloLibro;
        this.precio = precio;
        this.categoria = categoria;
        this.genero = genero;
    }

    private String categoriaLibro(int categoria){

        switch(categoria){
            case 1:{
                return "Libros";
            }
            case 2:{
                return "Libros digitales";
            }
            case 3:{
                return "Mas vendidos";
            }
            case 4:{
                return "Comics";
            }
            default:{
                return " ERROR 3-N45 ¡No se ingreso una opcion correcta! ";
            }
        }
    }

    public CatalogoLibros (String tituloLibro, double precio, int categoria,
                    String ISBN, String genero, int numPaginas) {
        this.tituloLibro = tituloLibro;
        this.precio = precio;
        this.categoria = categoria;
        this.ISBN = ISBN;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }



    public String DatosLibros() {
        return  "\nNombre del libro: " + tituloLibro +
                "\nPrecio: " + precio  +"$" +
                "\nCategoria: " + categoriaLibro(categoria) +
                "\nISBN: " + ISBN +
                "\nGenero: " + genero +
                "\nNumero de paginas: " + numPaginas;
    }

    @Override
    public String toString() {
        return "" +
                "\nTitulo del Libro= " + tituloLibro +
                "\nPrecio= " + precio +"$" +
                "\nCategoria= " + categoria +
                "\nGenero= " + genero ;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }


}

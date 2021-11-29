import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner t = new Scanner(System.in);
        /*Arreglos */
        CarritoDeCompras [] librosEnCarrito = new CarritoDeCompras[10000];
        Usuario          [] usuarios        = new Usuario [10000]; 
        CatalogoLibros   [] catalogo        = new CatalogoLibros[10000];
        CarritoDeCompras carrito = null;


        int opcionCarrito, opcionRegistro, opcionSesion; // Esta variable es para que eligira (AGREGAR) / (ELIMINAR)
        int opcion; // Variable para el opciones del menú

        do {
            System.out.println(">>>> -- LIBRERIA ONLINE ABRIL -- <<<<");
            System.out.println(
                    // REGISTRO DE CLIENTE O ADMINISTRADOR
                    "\n1.Registrarse" + "\n2.Inicio de sesion "+ "\n3.Recuperar contraseña" +
                    "\n4.Carrito de compras" +
                    "\n5.Comprar libro" +
                    "\n6.Cerrar sesion");

            opcion = t.nextInt();
            switch ( opcion ){
                case 1:{
                    registroUsuarios(usuarios);
                    break;
                }
                case 2:{
                    System.out.println(">> OPCIONES DE INICIO DE SESION  <<" +
                            "\n1.Cliente"+
                            "\n2.Administrador");
                    opcionSesion = t.nextInt();
                    if (opcionSesion == 1 ){
                        sesionCliente(usuarios, catalogo);
                    }
                    else {
                        if (opcionSesion == 2 ){
                            sesionAdmin(usuarios, catalogo);
                        }
                    }
                    break;
                }
                case 3:{
                    recuperarContraseña(usuarios);
                    break;
                }
                case 4:{
                    /* Se muestran las opciones del carrito de compras */
                    System.out.println(">> OPCIONES DEL CARRITO DE COMPRAS <<" +
                            "\n1.AGREGAR AL CARRITO" +
                            "\n2.ELIMINAR DEL CARRITO" +
                            "\n3.VER MI CARRITO DE COMPRAS");
                    opcionCarrito = t.nextInt();
                    if ( opcionCarrito == 1) { //Si elige 1 lo llevara al metodo de agregarLibro
                        agregarLibro(librosEnCarrito,catalogo,carrito); //Se ejecuta el metodo agregar al carrito
                    }
                    else {
                        if ( opcionCarrito == 2){ //Si elige 2 lo llevara al metodo de eliminarLibro
                            eliminarLibro(librosEnCarrito,catalogo, carrito);  //Se ejecuta el metodo eliminar del carrito
                        }
                        else {
                            if ( opcionCarrito == 3){ //Si elige 3 lo llevara al metodo de verLibro
                                verCarrito(librosEnCarrito,catalogo,carrito);  //Se ejecuta el metodo verCarrito
                            }
                        }
                    break;
                    }
                }
                case 5:{
                    comprarLibro(catalogo);
                }
                case 6:{
                    System.out.println("Sesion finalizada...!!");
                    break;
                }
                default:{
                    System.out.println("Opcion incorrecta!");
                    break;
                }
            }
        }while (opcion != 6);

    }

    //Metodo para comprar libro
    private static void comprarLibro(CatalogoLibros[] catalogo) {

        Scanner sc = new Scanner(System.in);
        String ISBN, nombre, direccion, numTargeta;
        int metodoPago, opcion, CCV;
        System.out.println("\n>>> METODO DE PAGO <<<");
        System.out.print("Ingrese el ISBN del libro que desea comprar: ");
        ISBN = sc.next();

        for (int i = 0; i < catalogo.length; i++) {
            if(catalogo[i] != null){
                if(catalogo[i].getISBN().equals(ISBN)){
                    System.out.println("\n>>> METODO DE PAGO <<<");
                    System.out.println("1. Santander \n2. Mercado pago \n3. VISA \n4. OXXOpay");
                    System.out.print("Ingrese una opcion: ");
                    opcion = sc.nextInt();

                    switch(opcion){
                        case 1:{
                            System.out.println("\n-------------------------------");
                            System.out.println("        SANTANDER    ");
                            System.out.println("-------------------------------");

                            System.out.println("\n>>> INFORMACION DEL USUARIO <<<");
                            System.out.print("Ingrese su nombre: ");
                            sc.nextLine();
                            nombre = sc.nextLine();
                            System.out.print("Ingrese su direccion: ");
                            direccion = sc.nextLine();
                            System.out.println("\n>>> INFORMACION DE LA TARGETA DEL USUARIO: " + nombre + " <<<");
                            System.out.print("Ingrese el numero de su targeta: ");

                            numTargeta = sc.next();
                            System.out.print("Ingrese CCV de la targeta: ");
                            CCV = sc.nextInt();
                            System.out.println("");
                            System.out.println("Compra exitosa!!!!");
                            System.out.println(catalogo[i].DatosLibros());
                            break;
                        }
                        case 2:{
                            System.out.println("\n-------------------------------");
                            System.out.println("       MERCADO PAGO    ");
                            System.out.println("-------------------------------");

                            System.out.println("\n>>> INFORMACION DEL USUARIO <<<");
                            System.out.print("Ingrese su nombre: ");
                            sc.nextLine();
                            nombre = sc.nextLine();
                            System.out.print("Ingrese su direccion: ");
                            direccion = sc.nextLine();
                            System.out.println("\n>>> INFORMACION DE LA TARGETA DEL USUARIO: " + nombre + " <<<");
                            System.out.print("Ingrese el numero de su targeta: ");
                            numTargeta = sc.next();
                            System.out.print("Ingrese CCV de la targeta: ");
                            CCV = sc.nextInt();
                            System.out.println("");
                            System.out.println("Compra exitosa!!!!");
                            System.out.println(catalogo[i].DatosLibros());
                            break;
                        }
                        case 3:{
                            System.out.println("\n-------------------------------");
                            System.out.println("         VISA    ");
                            System.out.println("-------------------------------");

                            System.out.println("\n>>> INFORMACION DEL USUARIO <<<");
                            System.out.print("Ingrese su nombre: ");
                            sc.nextLine();
                            nombre = sc.nextLine();
                            System.out.print("Ingrese su direccion: ");
                            direccion = sc.nextLine();
                            System.out.println("\n>>> INFORMACION DE LA TARGETA DEL USUARIO: " + nombre + " <<<");
                            System.out.print("Ingrese el numero de su targeta: ");
                            numTargeta = sc.next();
                            System.out.print("Ingrese CCV de la targeta: ");
                            CCV = sc.nextInt();
                            System.out.println("");
                            System.out.println("Compra exitosa!!!!");
                            System.out.println(catalogo[i].DatosLibros());
                            break;
                        }
                        case 4:{
                            System.out.println("\n-------------------------------");
                            System.out.println("       OXXOpay    ");
                            System.out.println("-------------------------------");

                            System.out.println("\n>>> INFORMACION DEL USUARIO <<<");
                            System.out.print("Ingrese su nombre: ");
                            sc.nextLine();
                            nombre = sc.nextLine();
                            System.out.print("Ingrese su direccion: ");
                            direccion = sc.nextLine();
                            System.out.println("\n>>> INFORMACION DE LA TARGETA DEL USUARIO: " + nombre + " <<<");
                            System.out.print("Ingrese el numero de su targeta: ");
                            numTargeta = sc.next();
                            System.out.print("Ingrese CCV de la targeta: ");
                            CCV = sc.nextInt();
                            System.out.println("");
                            System.out.println("Compra exitosa!!!!");
                            System.out.println(catalogo[i].DatosLibros());
                            break;
                        }
                    }
                }else{
                    System.out.println("El ISBN (" + ISBN + ")" + " No coincide con ningun ISBN registrado!");
                    break;
                }
            }
        }
    }
    //Metodo para recuperar contraseña
    private static void recuperarContraseña(Usuario[] usuarios) {
        Scanner t = new Scanner(System.in);
        String email;

        /*
         *  Se muestra el apartadeo de recuperación de contraseña
         *  y se piden datos al usuario
         */
        System.out.println("\n ***** RECUPERACIÓN DE CONTRASEÑA *****");
        System.out.print("Dame tu e-mail: ");
        email = t.next();

        /*
         *  Se comprobará que el e-mai recién ingresado sea igual al e-mail
         *  del usuario en la lista de ususarios
         */
        for ( int i = 0; i < usuarios.length; i++ ) {
            if ( usuarios[i] != null  ) {
                if ( email.equals( usuarios[i].getEmail() ) ) {
                    //Se evía un correo electrónico al usuario con su clave
                    System.out.println("Correo electrónico: su clave es " + usuarios[i].getClave());
                    System.out.println("Contraseña enviada por correo");
                }
                else {
                    System.out.println("E-mail incorrecto");
                }
            }
        }
    }
    //Metodo para opciones de administrador
    private static void modificarCatalogo(CatalogoLibros[] catalogo) {
        Scanner sc = new Scanner(System.in);

        String tituloLibro, genero, ISBN;
        int categoria, numPaginas;
        double precio;
        int opcion;

        String op;

        do {
            System.out.println(" " +
                    "\n1.Registrar libro" +
                    "\n2.Modificar libro" +
                    "\n3.Eliminar libro" +
                    "\n4.Ver catalogo" +
                    "\n5.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {

                    System.out.println("-------------------------------");
                    System.out.println("        REGISTRAR LIBRO        ");
                    System.out.println("-------------------------------");
                    sc.nextLine();
                    System.out.print("Titulo de libro: ");
                    tituloLibro = sc.nextLine();
                    System.out.print("Precio: ");
                    precio = sc.nextDouble();
                    System.out.print("ISBN: ");
                    ISBN = sc.next();
                    sc.nextLine();
                    System.out.print("Genero: ");
                    genero = sc.nextLine();
                    System.out.print("Numero de paginas: ");
                    numPaginas = sc.nextInt();
                    System.out.println("Categoria a la que pertenece el libro " + tituloLibro + ":");
                    System.out.println("1. Libros \n2. Libros digitales \n3. Mas vendidos \n4. Comics ");
                    System.out.print("Ingresa la opcion de la categoria: ");
                    categoria = sc.nextInt();

                    for (int i = 0; i < catalogo.length; i++) {
                        if(catalogo[i] == null) {
                            catalogo[i] = new CatalogoLibros(tituloLibro, precio, categoria, ISBN, genero, numPaginas);
                            System.out.println("Libro " + catalogo[i].getTituloLibro() + " registrado!");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    String ISBNModificar;
                    int op1;
                    System.out.println("-------------------------------");
                    System.out.println("    MODIFICAR DATOS DE LIBRO   ");
                    System.out.println("-------------------------------");
                    System.out.print("ISBN del libro que desea modificar: ");
                    ISBN = sc.next();

                    for (int i = 0; i < catalogo.length; i++) {
                        if(catalogo[i] != null){
                            if(catalogo[i].getISBN().equals(ISBN)){
                                System.out.println(catalogo[i].DatosLibros());
                                System.out.println("\n¿Que desea cambiar?");
                                System.out.println("\n1. Titulo del libro \n2. Precio del libro \n3. Cambiar de categoria \n4. Genero del libro \n5. Numero de paginas \n6.ISBN ");
                                System.out.print("Ingrese una opcion: ");
                                op1 = sc.nextInt();

                                switch(op1){
                                    case 1:{
                                        System.out.println("Nombre del libro actual: " + catalogo[i].getTituloLibro());
                                        System.out.print("Nombre nuevo: ");
                                        sc.nextLine();
                                        String nombreNuevo = sc.nextLine();
                                        catalogo[i].setTituloLibro(nombreNuevo);
                                        break;
                                    }
                                    case 2:{
                                        System.out.println("Precio del libro actual: " + catalogo[i].getPrecio());
                                        System.out.print("Precio nuevo: ");
                                        double precioNuevo = sc.nextDouble();
                                        catalogo[i].setPrecio(precioNuevo);
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("1. Libros \n2. Libros digitales \n3. Mas vendidos \n4. Comics");
                                        System.out.println("Categoria del libro actual: " + catalogo[i].getCategoria());
                                        System.out.print("Categoria nueva: ");
                                        int categoriaNueva = sc.nextInt();
                                        catalogo[i].setCategoria(categoriaNueva);
                                        break;
                                    }
                                    case 4:{
                                        System.out.println("Genero del libro actual: " + catalogo[i].getGenero());
                                        System.out.print("Genero nuevo: ");
                                        sc.nextLine();
                                        String generoNuevo = sc.nextLine();
                                        catalogo[i].setGenero(generoNuevo);
                                        break;
                                    }
                                    case 5:{
                                        System.out.println("Numero de paginas del libro actual: " + catalogo[i].getNumPaginas());
                                        System.out.print("Nuevo numero de paginas: ");
                                        int numPaginaNuevo = sc.nextInt();
                                        catalogo[i].setNumPaginas(numPaginaNuevo);
                                        break;
                                    }
                                }

                            }
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("ELIMINAR LIBRO");
                    sc.nextLine();
                    System.out.print("Ingrese ISBN para eliminar: ");
                    ISBN = sc.nextLine();
                    for (int i = 0; i < catalogo.length; i++) {
                        if(catalogo[i] != null) {
                            if (catalogo[i].getISBN().equals(ISBN))
                                catalogo[i] = null;
                            System.out.println("Libro eliminado!");
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("-------------------------------");
                    System.out.println("        CATALOGO DE LIBROS     ");
                    System.out.println("-------------------------------");
                    for (int i = 0; i < catalogo.length; i++) {
                        if(catalogo[i] != null){
                            System.out.println(catalogo[i].DatosLibros());
                        }
                    }
                    break;
                }
            }
        }while (opcion != 5);

    }
    //Metodo para iniciar sesion como Admin
    private static boolean sesionAdmin(Usuario[] usuarios, CatalogoLibros [] catalogo) {
        Scanner t      = new Scanner(System.in);
        boolean sesion = false; //Indica si la sesión está cerrada o abierta
        String email; //Será el e-mail que se comparará
        String clave; //Será la clave que se comparará


        System.out.println("\n ***** INICIO DE SESIÓN PARA ADMIN *****");
        System.out.print("Ingrese su e-mail: ");
        email = t.next();
        System.out.print(" Ingrese su clave: ");
        t.nextLine();
        clave = t.nextLine();

        /* Se compararán el e-mail y clave ingresados con la lista de usuarios */
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                if (email.equals(usuarios[i].getEmail()) && clave.equals(usuarios[i].getClave())) {
                    sesion = true; //Se indica que la sesión está abierta
                    break;
                }
            }
        }

        /*
         *  Se retornará un booleano dependiendo de este if. Al devolver un true,
         */
        if (sesion) {
            System.out.println("Sesión iniciada");
            //System.out.println("Se muestran opciones de administrador");
            modificarCatalogo(catalogo);
            return true;
        } else {
            System.out.println("E-mail o clave incorrectos");
            return false;
        }

    }
    //Se muestra el catalogo para el cliente
    private static void verCatalogo(CatalogoLibros[] catalogo) {
        System.out.println("-------------------------------");
        System.out.println("        CATALOGO DE LIBROS     ");
        System.out.println("-------------------------------");
        for (int i = 0; i < catalogo.length; i++) {
            if(catalogo[i] != null){
                System.out.println(catalogo[i].DatosLibros());
            }
        }
    }
    //Metodo para iniciar sesion
    private static boolean sesionCliente(Usuario[] usuarios, CatalogoLibros [] catalogo) {
        Scanner t      = new Scanner(System.in);
        boolean sesion = false; //Indica si la sesión está cerrada o abierta
        String email; //Será el e-mail que se comparará
        String clave; //Será la clave que se comparará


        System.out.println("\n ***** INICIO DE SESIÓN  *****");
        System.out.print("Ingrese su e-mail: ");
        email = t.next();
        System.out.print(" Ingrese su clave: ");
        t.nextLine();
        clave = t.nextLine();

        /* Se compararán el e-mail y clave ingresados con la lista de clientes */
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                if (email.equals(usuarios[i].getEmail()) && clave.equals(usuarios[i].getClave())) {
                    sesion = true; //Se indica que la sesión está abierta
                    break;
                }
            }
        }

        /*
         *  Se retornará un booleano dependiendo de este if. Al devolver un true,
         *  se enseñará el menú del cliente y se cerrará el menú desesión
         */
        if (sesion) {
            System.out.println(" >    Sesión iniciada     < ");
            //System.out.println("Se muestra el menú de cliente");
            verCatalogo(catalogo);
            return true;
        } else {
            System.out.println("E-mail o clave incorrectos");
            return false;
        }
    }
    /* Metodo para registrar usuarios */
    private static void registroUsuarios(Usuario[] usuarios) {
        Scanner t = new Scanner(System.in);
        Usuario usuario = null; //Objeto que se llenará con los datos
        String nombre; //Nombre de usuario ingresado
        String clave;  //Clave de usuario ingresada
        String email;  //E-mail de usuario ingresado


        System.out.println("\n ***** REGISTRO *****");
        System.out.print("¿Cual es su nombre? ");
        nombre = t.nextLine();
        System.out.print("¿Cual es su e-mail? ");
        email = t.next();
        System.out.print("¿Cuál es su clave? ");
        t.nextLine();
        clave = t.nextLine();
        System.out.println("(1.Cliente) (2.Admin) ");
        int opcionRegistro = t.nextInt();
        switch (opcionRegistro){
            case 1:{
                usuario = new Usuario(nombre, email, clave);
                break;
            }
            case 2:{
                usuario = new Administrador(nombre, email, clave);
                break;
            }
        }
        /* Se busca un espacio disponible en la lista de usuarios para asignarle el objeto de usuario*/
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                System.out.println("Registro exitoso !!!!");
                break;
            }
        }
    }
    /* Metodo para ver el carrito */
    private static void verCarrito(CarritoDeCompras[] librosEnCarrito, CatalogoLibros [] catalogo, CarritoDeCompras carrito) {
        System.out.println(">> MI CARRITO DE COMPRAS <<");
          /*
        Ciclo para ver lo que hay en carrito de compras
        */
        boolean carritoVacio = true;
        for ( int i = 0; i< catalogo.length; i++ ){
            for (int j=0;j< librosEnCarrito.length; j++){
            if ( catalogo[i] != null ) {
                System.out.println(librosEnCarrito[i].toString());
                carritoVacio = false;
                break;
            }
            }
        }
        if (carritoVacio){
            System.out.println("Carrito de compras vacío");
        }
    }
    /* Metodo para eliminar libro del carrito */
    private static void eliminarLibro(CarritoDeCompras[] librosEnCarrito, CatalogoLibros [] catalogo, CarritoDeCompras carrito) {

        Scanner t = new Scanner(System.in);
        //El usuario ingresara el ISBN del libro que desea eliminar.
        String ISBN;
        boolean ISBNCorrecto = false;
        System.out.println(">> ELIMINAR LIBRO AL CARRITO <<");
        System.out.print("Ingresa el ISBN del libro: ");
        ISBN = t.nextLine();
          /*
        Ciclo para eliminar libro
        */
        for ( int i = 0; i < catalogo.length; i++ ){
            for (int j=0; j< librosEnCarrito.length; j++){
            if ( catalogo[i] != null && librosEnCarrito[j] != null ){
                if ( catalogo[i].getISBN().equals(ISBN)) {
                    carrito = null;
                    System.out.println("Libro eliminado del carrito..!");


                    librosEnCarrito[i] = carrito;
                    ISBNCorrecto = true;
                    break;
                }
                }
            }
        }
        if (!ISBNCorrecto){
            System.out.println("ISBN INCORRECTO!!!" +
                    "\nIngrese de nuevo el ISBN");
        }
    }
    /* Metodo para agregar libro al carrito */
    private static void agregarLibro(CarritoDeCompras[] librosEnCarrito, CatalogoLibros[] catalogo, CarritoDeCompras carrito) {
        Scanner t = new Scanner(System.in);
        //El usuario ingresara el ISBN del libro que desea agregar al carrito.

        String tituloLibro, genero;
        int categoria;
        double precio;
        int opcion;
        String agregarISBN;
        boolean libroCorrecto = false;
        System.out.println(">> AGREGAR LIBRO AL CARRITO <<");
        System.out.print("Ingresa el ISBN del libro: ");
        agregarISBN = t.nextLine();
        System.out.print("Titulo de libro: ");
        tituloLibro = t.nextLine();
        System.out.print("Precio: ");
        precio = t.nextDouble();
        t.nextLine();
        System.out.print("Genero: ");
        genero = t.nextLine();
        System.out.print("Categoria: ");
        categoria = t.nextInt();

        /*
        Ciclo para agregar libro
        */
            for (int i=0; i< catalogo.length; i ++){
                for (int j=0; j< librosEnCarrito.length; j++){
                if (catalogo[i] != null ){
                    if (catalogo[i].getISBN().equals(agregarISBN)) {
                        carrito = new CarritoDeCompras(tituloLibro, precio, categoria, genero);
                        librosEnCarrito[i] = carrito;
                        System.out.println(librosEnCarrito[i].toString() +
                                "\nLibro agregado..!");
                        libroCorrecto = true;
                        break;
                    }
                }
            }
        }
        if (!libroCorrecto){
            System.out.println("ISBN INCORRECTO..!!" +
                    "\nIngrese de nuevo el ISBN  ");
        }
    }
}

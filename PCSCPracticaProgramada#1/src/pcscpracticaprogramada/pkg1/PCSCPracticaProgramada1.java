package pcscpracticaprogramada.pkg1;

public class PCSCPracticaProgramada1 {

    public static void main(String[] args) {
        // Creación de objetos Autor y Libro
        Autor autor = new Autor("John", "Tolkien");
        Libro libro1 = new Libro("El señor de los anillos", autor, 1954, true);
        Libro libro2 = new Libro("El hobbit", autor, 1937, true);
        
        autor.agregarLibro(libro1);
        autor.agregarLibro(libro2);

        // Creación de un usuario
        Usuario usuario = new Usuario("12-10-2024", "Alex", "alex@gmail.com");
        
        // Mostrar información del autor y sus libros
        System.out.println("Autor: " + autor.getNombre() + " " + autor.getApellido());
        System.out.println("Libros escritos: ");
        for (Libro libro : autor.getLibros()) {
            System.out.println(" - " + libro.getTitulo() + " (" + libro.getAnioPublicacion() + ")");
        }

        // Crear préstamos regulares y urgentes
        PrestamoRegular prestamo = new PrestamoRegular(libro1, usuario);
        prestamo.realizarPrestamo(libro1, usuario); 

        PrestamoUrgente prestamoUrgente = new PrestamoUrgente(libro2, usuario);
        prestamoUrgente.realizarPrestamo(libro2, usuario); 

        // Gestión de libros usando la clase AdministracionBiblioteca
        AdministracionBiblioteca adminBiblioteca = new AdministracionBiblioteca();

        // Agregar libros a la biblioteca
        adminBiblioteca.agregarLibro(libro1);
        adminBiblioteca.agregarLibro(libro2);

        // Agregar usuario a la biblioteca
        adminBiblioteca.agregarUsuario(usuario);

        // Mostrar todos los libros en la biblioteca
        adminBiblioteca.mostrarLibros();

        // Ordenar y mostrar los libros por año de publicación
        adminBiblioteca.ordenarLibrosPorAnio();

        // Buscar un libro por título
        Libro libroBuscado = adminBiblioteca.buscarLibroPorTitulo("El hobbit");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado: " + libroBuscado.getTitulo() + " (" + libroBuscado.getAnioPublicacion() + ")");
        } else {
            System.out.println("Libro no encontrado.");
        }

        // Registrar préstamos en la biblioteca
        adminBiblioteca.registrarPrestamo(usuario, libro1);
        adminBiblioteca.registrarPrestamo(usuario, libro2);

        // Mostrar los libros prestados por el usuario
        adminBiblioteca.mostrarPrestamosDeUsuario(usuario);
    }
}

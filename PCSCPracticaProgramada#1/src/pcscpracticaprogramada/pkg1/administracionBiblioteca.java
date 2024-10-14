package pcscpracticaprogramada.pkg1;

import java.util.*;

/**
 *
 * @author Andy
 */
public class AdministracionBiblioteca {
    private Collection<Libro> coleccionLibros;
    private Collection<Usuario> coleccionUsuarios;
    private Set<Libro> setLibrosUnicos;
    private Map<Usuario, List<Libro>> mapPrestamos;

    public AdministracionBiblioteca() {
        coleccionLibros = new ArrayList<>();
        coleccionUsuarios = new ArrayList<>();
        setLibrosUnicos = new HashSet<>();
        mapPrestamos = new HashMap<>();
    }

    // Agregar libros a la colección general
    public void agregarLibro(Libro libro) {
        coleccionLibros.add(libro);
        setLibrosUnicos.add(libro);  // Evitar duplicados
    }

    // Agregar usuarios a la colección
    public void agregarUsuario(Usuario usuario) {
        coleccionUsuarios.add(usuario);
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : coleccionLibros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor().getNombre());
        }
    }

    // Ordenar libros por año de publicación
    public void ordenarLibrosPorAnio() {
        List<Libro> librosOrdenados = new ArrayList<>(coleccionLibros);
        Collections.sort(librosOrdenados, Comparator.comparingInt(Libro::getAnioPublicacion));
        System.out.println("Libros ordenados por año de publicación:");
        for (Libro libro : librosOrdenados) {
            System.out.println(libro.getTitulo() + " - " + libro.getAnioPublicacion());
        }
    }

    // Buscar libro por título
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : coleccionLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // No se encontró el libro
    }

    // Registrar préstamo de un libro a un usuario
    public void registrarPrestamo(Usuario usuario, Libro libro) {
        if (!mapPrestamos.containsKey(usuario)) {
            mapPrestamos.put(usuario, new ArrayList<>());
        }
        mapPrestamos.get(usuario).add(libro);
    }

    // Mostrar préstamos de un usuario
    public void mostrarPrestamosDeUsuario(Usuario usuario) {
        List<Libro> librosPrestados = mapPrestamos.get(usuario);
        if (librosPrestados != null) {
            System.out.println("Libros prestados al usuario " + usuario.getNombre() + ":");
            for (Libro libro : librosPrestados) {
                System.out.println(libro.getTitulo());
            }
        } else {
            System.out.println("El usuario no tiene libros prestados.");
        }
    }
}

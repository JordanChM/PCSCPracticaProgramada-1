/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

/**
 *
 * @author Andy
 */
public class PCSCPracticaProgramada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Autor autor = new Autor("John", "Tolkien");
        Libro libro1 = new Libro("El senior de los anillos", autor, 1954, true);
       
        autor.agregarLibro(libro1);


        Usuario usuario = new Usuario("12-10-2024", "Juan Pérez", "alex@gmail.com");
        

        System.out.println("Autor: " + autor.getNombre() + " " + autor.getApellido());
        System.out.println("Libros escritos: ");
        for (Libro libro : autor.getLibros()) {
            System.out.println(" " + libro.getTitulo() + " " + libro.getAnioPublicacion() + " ");
        }

        try {

            PrestamoRegular prestamo = new PrestamoRegular(libro1, usuario);
            prestamo.validarPrestamo(libro1, usuario); 
            prestamo.calcularCosto(); 

            PrestamoUrgente prestamoUrgente = new PrestamoUrgente(libro1, usuario);
            prestamoUrgente.calcularCosto(); 

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

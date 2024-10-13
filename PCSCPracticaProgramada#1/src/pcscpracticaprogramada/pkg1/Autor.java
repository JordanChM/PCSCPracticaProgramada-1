/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy
 */
public class Autor {
    private String nombre;
    private String apellido;
    private List<Libro> libros;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.libros = new ArrayList<>();
    }
    
   public void agregarLibro(Libro libro){
       libros.add(libro);
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    
}

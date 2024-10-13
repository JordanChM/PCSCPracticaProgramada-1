/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

/**
 *
 * @author Andy
 */
public abstract class Prestamo {
    protected Libro libro;
    protected Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
    }
    
    
    public abstract void calcularCosto();
}

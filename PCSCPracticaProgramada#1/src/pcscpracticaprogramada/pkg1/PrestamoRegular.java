/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcscpracticaprogramada.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class PrestamoRegular extends Prestamo{
    private int duracion;
    private int costo = 360;

    public PrestamoRegular(Libro libro, Usuario usuario) {
        super(libro, usuario);
    }

    @Override
    public void calcularCosto(){
        int costoFinal;
        duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dias que desea poseer el libro: "));
        costoFinal = duracion*costo;
        JOptionPane.showMessageDialog(null, "El costo del prestamo sera de: " + costoFinal);
        libro.setDisponible(false);
        }
    
    public void validarPrestamo(Libro libro, Usuario usuario) throws Exception {
        if (!libro.isDisponible()) {
            throw new Exception("El libro no está disponible");
        }
        if (usuario.getEmail() == null) {
            throw new Exception("El usuario no está registrado");
        }
    }
}

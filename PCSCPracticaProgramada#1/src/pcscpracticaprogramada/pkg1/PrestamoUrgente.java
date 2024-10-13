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
public class PrestamoUrgente extends Prestamo{
    private int duracion = 7;
    private int costo = 450;

    public PrestamoUrgente(Libro libro, Usuario usuario) {
        super(libro, usuario);
    }
    
    @Override
    public void calcularCosto(){
        int costoFinal;
        String ampliar;
        costoFinal = duracion*costo;
        JOptionPane.showMessageDialog(null, "El costo del prestamo urgente (por 7 dias) sera de: " + costoFinal);
        while (true) {            
            ampliar = JOptionPane.showInputDialog("Desea ampliar el prestamo? (si/no)");
            if (ampliar.equals("si")){
                duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dias que desea alargar el prestamo: "));
                costoFinal = duracion*costo;
                JOptionPane.showMessageDialog(null, "El costo del prestamo urgente (por " +duracion+ " dias) sera de: " + costoFinal);
                break;
            }else if (ampliar.equals("no")){         
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El dato ingresado es incorrecto");
            }
        
        
            
        }
    }
}
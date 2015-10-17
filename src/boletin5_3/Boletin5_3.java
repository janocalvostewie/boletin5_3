package boletin5_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin5_3 {

    public static void main(String[] args) {
        //PRIMEr OBJETO
        Circulo primerCirculo= new Circulo();
        JOptionPane.showMessageDialog(null,"PRIMER OBJETO\nEl valor inicial: "+primerCirculo.getRadio());
        
        //SEGUNDO OBJETO
        Circulo segundoCirculo= new Circulo (Double.parseDouble(JOptionPane.showInputDialog("Teclea el radio:")));
        JOptionPane.showMessageDialog(null,"SEGUNDO OBJETO\nEl valor inicial: "+segundoCirculo.getRadio());
        segundoCirculo.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Teclea el radio:")));
        JOptionPane.showMessageDialog(null,"SEGUNDO OBJETO\nEl valor ahora es: "+segundoCirculo.getRadio());
        JOptionPane.showMessageDialog(null,"SEGUNDO OBJETO\nEl area: "+segundoCirculo.calcularArea());
        JOptionPane.showMessageDialog(null,"SEGUNDO OBJETO\nLa longitud: "+segundoCirculo.calcularLongitud());
    }
    
}

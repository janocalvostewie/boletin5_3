
package boletin5_3;
/**
 *
 * @author Jano
 */
public class Circulo {
    //ATRIBUTOS
    private double radio;
    private static final double PI=3.14;
    
    //CONSTRUCTORES
    public Circulo(){
    
    }
    public Circulo (double ra){
    radio=ra;
    }
    
    //SETTERS
    public void setRadio(double ra){
        radio=ra;
    }
    
    //GETTERS
    public double getRadio(){
        return radio;
    }
    
    //MÉTODOS
    public double calcularArea(){
        return PI*Math.pow(radio, 2);
    }
    public double calcularLongitud(){
        return PI*(radio* 2);
    }
}

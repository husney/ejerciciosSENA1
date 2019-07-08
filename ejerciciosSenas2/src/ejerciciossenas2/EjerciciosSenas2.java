/*
una fruteria ofrece las manzanas a $4.200 el kilo, con un descuento de acuerdo a la siguiente tabla:
numeroroKilos        %descuento
0-2                     0%
2,01 - 5                10%
5,01 - 10               15%
> 10,01                 20%
Desarrollar un algoritmo que permita a la fruterÃ­a y al cliente conocer cuanto pagarÃ¡ un cliente que compre manzanas.  
 */
package ejerciciossenas2;
import javax.swing.*;

public class EjerciciosSenas2 {

    
    public static void main(String[] args) {
        
        int numk= 0;
         double kilo= 4.200;
            
        numk= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de kilos"));
           
        
        if (numk <=2){
            double resultado = numk*kilo*1000;
            JOptionPane.showMessageDialog(null, "El precio de " + numk + " es de " + resultado );
        }
        else if (numk <=5){
            double dcto = 0.10;
            double resultado = (numk*kilo)/dcto;
            double redondeo = (double)Math.round(resultado*1000);
            JOptionPane.showMessageDialog(null, "El precio de " + numk + " kilos es de " + redondeo + " con un descuento del 10% " );
        }
        else if ( numk <10){
            double dcto = 0.15;
            double resultado = (numk*kilo)/dcto;
            double redondeo=(double)Math.round(resultado*1000);
            JOptionPane.showMessageDialog(null, "El precio de " + numk + "kilos es de " + redondeo + " con un descuento del 15% ");
        }
        else if ( numk > 10){
            double dcto= 0.20;
            double resultado = ( numk * kilo)/dcto;
            double redondeo= (double) Math.round(resultado*1000);
            JOptionPane.showMessageDialog(null, "El precio de " + numk + " kilos es de "+ redondeo+ " con un descuento del 20%" );
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}

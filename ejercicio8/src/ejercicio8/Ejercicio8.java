/*
CUARTO ENUNCIADO: hacer un algoritmo que imprima el costo de una llamada telefónica, capturando la duración de la llamada en minutos y conociendo lo siguiente:

• Toda llamada que dure tres minutos o menos tiene un costo de $200.
• Cada minuto adicional cuesta $30.​​
 */
package ejercicio8;
import javax.swing.*;
public class Ejercicio8 {

    public static void main(String[] args) {
        int minuto=200;
        int precio=0;
        int tiempo=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de minutos que ha durado la llamada"));
        
        if (tiempo <= 3){
            JOptionPane.showMessageDialog(null,"La llamada de " +tiempo+  " minutos tiene un costo de $"+minuto);
        } 
        else if (tiempo>=4) {
        for (int i =4; i<=tiempo; i++){
             minuto+=30;
            
        
        }
       
    JOptionPane.showMessageDialog(null,"La llamada de " + tiempo+ " minutos tiene un custo de " +minuto);
        }
    } 
    
}

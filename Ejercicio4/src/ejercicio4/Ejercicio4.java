/*
CUARTO ENUNCIADO: desarrollar un algoritmo que lea un número N entero positivo de cualquier número de dígitos,
calcule la suma de sus dígitos y que imprima en pantalla el número leído y la suma de sus dígitos. Se requiere 
que en el desarrollo utilice la Estructura Cíclica Mientras.
 */
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

                        int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        String cadena= Integer.toString(numero);
                        int i=0;
                        int suma=0;
                        while( i< cadena.length()){
                        char posicion= cadena.charAt(i);
                        String cam= Character.toString(posicion);
                        suma= Integer.parseInt(cam)+suma;
                        i++;
                        }
                        
                            JOptionPane.showMessageDialog(null, suma);
    }

}

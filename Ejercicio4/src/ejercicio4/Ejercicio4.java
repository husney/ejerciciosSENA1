/*
CUARTO ENUNCIADO: desarrollar un algoritmo que lea un número N entero positivo de cualquier número de dígitos,
calcule la suma de sus dígitos y que imprima en pantalla el número leído y la suma de sus dígitos. Se requiere 
que en el desarrollo utilice la Estructura Cíclica Mientras.
 */
package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

//        String numero= JOptionPane.showInputDialog("Ingrese un numero");
//        int suma=0;
//        int i=0;
//
//
//
//        while (i< numero.length()){
//            char posicion= numero.charAt(i);
//            String n= Character.toString(posicion);
//            suma =Integer.parseInt(n) + suma;
//            System.out.println("Numero ingresado: "+posicion);
//            i++;
//        }
//        System.out.println("Suma; "+ suma);
////        
//        String numero = JOptionPane.showInputDialog("Ingrese un numero");
//        int suma = 0;
//        int i = 0;
//        while (i < numero.length()) {
//
//            char posicion = numero.charAt(i);
//            String n = Character.toString(posicion);
//            suma = Integer.parseInt(n) + suma;
//
//            i++;
//
//        }
//        System.out.println("numero: " + numero);
//        System.out.print("suma: " + suma);
//        
/*
                    char pos1 = numIngresado.charAt(i);//posiciona el caracter recorrido en el ciclo 
                    String n = Character.toString(pos1);//Convertir el tipo char en String
                    suma = Integer.parseInt(n) + suma;//convertir String n en int para poder sumar, luego sumar
         */
//        --------------------------------------
//                    int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
//                    String numero= Integer.toString(n);
//                    int i=0;
//                    String suma="";
//                    int sumado=0;
//                    while (i<numero.length()){
//                        char vuelta=numero.charAt(i);
//                        suma= Character.toString(vuelta);
//                        sumado= Integer.parseInt(suma);
//                        sumado+=i;
//                        i++;
//                    }
//                    JOptionPane.showMessageDialog(null, "El numero es:" + sumado);


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

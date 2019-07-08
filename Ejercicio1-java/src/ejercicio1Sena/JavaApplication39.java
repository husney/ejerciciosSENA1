/*--->  
Una persona deposita hoy al Banco cierta cantidad de dinero, donde le reconocen un interÃ©s del 2% mensual, capitalizado mensualmente. 
Â¿CuÃ¡l serÃ¡ el saldo al cabo de 5 aÃ±os?
Formula a utilizar: Valor futuro = valor presente *(1+interes)^meses
para solucionar el Ejercicio, se requiere que usted desarrolle un algoritmo que le permita conocer a una persona Â¿CuÃ¡l serÃ¡ el saldo 
al cabo de 5 aÃ±os?, si deposita hoy cierta cantidad de dinero. Como resultado se debe imprimir en pantalla:
Valor consignado: $XXXX
Valor futuro en 5 aÃ±os: $XXX
 */
package ejercicio1Sena;

import javax.swing.*;
import java.text.*;

public class JavaApplication39 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.0000");
        double valorpresente = 0;
        double resultado = 0;
        double valorFuturo = 0;
        double time= Double.parseDouble(JOptionPane.showInputDialog("Ingrese años"));

        valorpresente = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el dinero a depositar"));
        //int anios= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese los años que desea capitalizar"));
        valorFuturo = valorpresente * ((double) Math.pow(1.02, time * 12));
//        resultado= Math.round(valorFuturo*1000);
        System.out.println(valorFuturo);
        JOptionPane.showMessageDialog(null, df.format(valorFuturo));
//        JOptionPane.showMessageDialog(null, "Su saldo al cabo de " + anios+ " años sera " +resultado);

    }

}

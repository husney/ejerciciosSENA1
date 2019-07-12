/*
 un grupo de 10 estudiantes presentan un examen de Física. Hacer un algoritmo que lea por cada estudiante la calificación obtenida.
Al finalizar calcule e imprima:​

​​• La cantidad de estudiantes que obtuvieron una calificación menor a 50.
• La cantidad de estudiantes que obtuvieron una calificación de 50 o más pero menor que 70.
• La cantidad de estudiantes que obtuvieron una calificación de 70 o más pero menor que 80.
• La cantidad de estudiantes que obtuvieron una calificación de 80 o más.

​La calificación obtenida en el examen de física debe ser entre 1 y 100.​
 */
package ejercicio9;
import javax.swing.*;

public class Ejercicio9 {

    
    public static void main(String[] args) {
 
        int calificacion=0;
        int estudiantes50=0;
        int estudiantes70=0;
        int estudiantes80=0;
        int estudiantesmas80=0;
      
        for ( int i=0; i<10;i++){
            
         calificacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación obtenida"));
        

        
         
        if (calificacion<50){
            estudiantes50+=1;
        }
        else if (calificacion <70){
            estudiantes70+=1;
        } 
        else if (calificacion <80){
            estudiantes80+=1;
        }
        else if (calificacion >80){
            estudiantesmas80+=1;
        }
        }
        
        System.out.println("Las personas que tuvieron una calificacion entre 50 fueron: " +estudiantes50);
        System.out.println("Las personas que tuvieron una calificacion entre 50 a 70 fueron: "+estudiantes70);
        System.out.println("Las personas que tuvieron una calificacion entre 70 a 80 fueron: "+estudiantes80);
        System.out.println("Las personas que tuvieron una calificiacion entre 80 a 100 fueron: "+estudiantesmas80);
        
        int totalestudiantes= estudiantes50+estudiantes70+estudiantes80+estudiantesmas80;
        System.out.print("Total estudiantes: "+ totalestudiantes);
        
        
        
        
        
        
    }
    
}

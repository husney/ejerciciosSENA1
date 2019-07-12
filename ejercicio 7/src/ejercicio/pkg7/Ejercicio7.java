/*
desarrollar un algoritmo que permita calcular los siguientes datos de una fiesta:

¿Cuántas personas asistieron a la fiesta?
¿Cuántos hombres y cuantas mujeres?
-Promedio de edades por sexo
-La edad de la persona más joven que asistió

Consideraciones:
-No se permiten menores de edad a la fiesta
-Ingresar datos hasta que se ingrese una edad igual a cero​ */
package ejercicio.pkg7;

import javax.swing.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        
        
        int edadtotalM=0;
        int edadtotalH=0;
        int promedioedadM=0;
        int promedioedadH=0;
        int totalpersonas=0;
        String genero=" ";
        int hombres=0;    
        int mujeres=0;
        int edad=0;
        int hombreJoven=100;
        int mujerJoven=100;
         do{
          genero=(JOptionPane.showInputDialog("Por favor ingrese \n 'H' si usted es Hombre \n 'M'  si usted es mujer  \n '0'Si quieres finalizar el programa"));
             
             if ( genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("H"));
             else if (genero.equalsIgnoreCase("0") ){
                 
                 JOptionPane.showMessageDialog(null,"Finalizando programa");
                 edad=0;
         }
             
             
              if (genero.equalsIgnoreCase("M")){
                 edad=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad"));
                 mujeres+=1;
                 edadtotalM+=edad;
                 if (mujerJoven>edad){
                     mujerJoven=edad;
                 }
                 if (edad <1){
                     JOptionPane.showMessageDialog(null, "Finalizando programa");
                 }
                 else if ( edad <18){
                     JOptionPane.showMessageDialog(null,"Usted es menor de edad, no puede ingresar");
                 }
                 
             }
              if (genero.equalsIgnoreCase("H")){
                 edad=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad"));
                 hombres+=1;
                 edadtotalH+=edad;
                 if (hombreJoven>edad){
                     hombreJoven=edad;
                 }
                 if (edad <1){
                     JOptionPane.showMessageDialog(null, "Finalizando programa");
                 }
                 else  if ( edad <18){
                     JOptionPane.showMessageDialog(null,"Usted es menor de edad, no puede ingresar");
                 }
             }
             
         }while(edad>0);
         
         //Operaciones
         totalpersonas=hombres+mujeres;
//         promedioedadM=edadtotalM/mujeres;
//         promedioedadH=edadtotalH/hombres;
         int edadTotal= edadtotalM+edadtotalH;
         
        int promedioedadtotal= edadTotal/totalpersonas ;
         
         System.out.println("Homres: "+hombres);
         System.out.println("Mujres: "+mujeres);
         System.out.println("Total personas: "+totalpersonas);
//         System.out.println("Promedio edad Mujeres: "+ promedioedadM);
//         System.out.println("Promedio edad Hombres : "+promedioedadH);
         System.out.println("Hombre mas Joven:" + hombreJoven);
         System.out.println("Mujer mas Joven: "+ mujerJoven);
         System.out.println("Promedio edad total: "+ promedioedadtotal);
         
         
         
//         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
//                do {
//
//
//                int genero= Integer.parseInt(JOptionPane.showInputDialog("Si usted es Hombre escriba '0' \n" 
//                                                                       + "Si usted es Mujer escriba '1'"));
//                    switch (genero) {
//                        case 0:
//                            edad= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad"));
//                            contadorHombre+=1;
//
//
//                            if (edad ==0){
//                                JOptionPane.showMessageDialog(null,"Finalizando programa");
//                            }
//                            else if (edad<18){
//                                JOptionPane.showMessageDialog(null,"Usted es menor de edad y no puede ingresar a la fiesta");
//
//                            }       break;
//                        case 1:
//                            edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad"));
//                            contadorMujer+=1;
//                            promedioEdadMujer=edad+edad;
//
//                            if (edad ==0){
//                                JOptionPane.showMessageDialog(null,"Finalizando programa");
//                            }
//                            else if(edad <18){
//                                JOptionPane.showMessageDialog(null,"Usted es menor de edad y no puede ingresar a la fiesta");
//
//                            }       break;
//
//                        default:
//                            JOptionPane.showMessageDialog(null,"Por favor ingrese una edad valida");
//                            break;
//                    }
//
//                   }while (edad >0);
//
//
//
//                System.out.println(edad);
//                 System.out.println("Hombres "+contadorHombre);
//                 System.out.println("Mujeres "+contadorMujer);
//                 personasTotal=contadorHombre+contadorMujer;
//                System.out.println("Personas en total "+ personasTotal);
//                System.out.println("persona mas joven "+ masjoven);
//                System.out.println("Promedio de edad de Mujeres "+ promedioEdadMujer );
//                System.out.println("Promedio edad de Hombres " +promedioEdadHombre );
//
//






//        int cantTotal=0;
//        int cantH=0;
//        int cantM=0;
//        int personaJoven=100;
//        int edadHombre;
//        int edadHMujer;
//        
//        int genero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese Genero\n"
//                + "Si es hombre digite '0'\n"
//                + "Si es Mujer digite '1'"));
//        if(genero==0){
//            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
//            System.out.println("Hombre");
//            cantH+=1;
//        }else if(genero==1){
//            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
//            System.out.println("Mujer");
//        }else{
//            System.out.println("Dato incorrecto");}
//        
//        
//        
////        if (edad<personaJoven){
////            personaJoven=edad;        
////        }
//        
//        
//        
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

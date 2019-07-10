/*
 desarrollar un algoritmo que calcule el salario neto que debe recibir un vendedor de un almacén. Se debe tener en cuenta si 
tiene derecho o no al auxilio de transporte. Para el desarrollo del ejercicio tenga en cuenta las siguientes formulas:
Sueldo devengado = salario básico * días laborados / 30.​
Días laborados = debe ser entre 1 y 30.​
Auxilio de Transporte: Lo reciben los empleados cuyo salario básico sea menor o igual a 2 salarios mínimos legales vigentes.​
Salario Mínimo Legal Vigente (2017): 737.717
​Auxilio de Transporte = 83.140 * días laborados / 30 (año 2017 en Colombia)


Comisión de Ventas: En la empresa se tiene estipulado dar una comisión de ventas del 2% sobre las ventas del mes de cada vendedor.​

Total devengado = sueldo devengado + comisión de ventas.​

Total deducciones = descuentos por prestamos.​

Salario Neto = Total devengado – Total deducciones 
Como resultado del ejercicio se debe imprimir en pantalla lo siguiente:

 Cédula empleado: XXXXXX
 Nombre Empleado: XXXXXXX
 Salario Básico: XXXXXX
 Auxilio de Transporte: XXXXXX
 Comisión de Ventas: XXXXXX
 Préstamos: XXXXXX
 Salario Neto a Recibir: XXXXX​*/
package ejercicio5;

import javax.swing.JOptionPane;


public class Ejercicio5 {

    
    public static void main(String[] args) {
 
        
        
//        INTENTO N#1---------------------------------
//        String nombre= JOptionPane.showInputDialog("Ingrese su nombre");
//        String cedula= JOptionPane.showInputDialog("Ingrese su cedula");
//        int dias= Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias laborados "));
//        double salario= 737.717;
//        final double transporte=83.140;
//        double comision= Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas que ha realizado"));
//        double auxiliotp= 0;
//        double sueldototal= 0;
//        int prestamos= Integer.parseInt(JOptionPane.showInputDialog("Tiene usted prestamos actuales?"));
//        if (dias>30){
//            JOptionPane.showMessageDialog(null,"Error ");
//        }
//        double salariofijo= salario*dias/30;
//        
//        if ( salario <= Math.pow(salario,2)){
//            auxiliotp= (auxiliotp* dias)/30;
//            
//        }
//        double comisiones= comision*0.2;
//        
//        sueldototal= salariofijo+comisiones;
//        
//        JOptionPane.showMessageDialog(null,"Cedula del empleado: "+cedula);
//        JOptionPane.showMessageDialog(null,"Nombre del empleado: "+nombre);
//        JOptionPane.showMessageDialog(null,"Salario basico: "+salariofijo);
//        JOptionPane.showMessageDialog(null,"Auxilio de transporte: "+auxiliotp);
//        JOptionPane.showMessageDialog(null,"Comision de Ventas: "+comisiones);
//        JOptionPane.showMessageDialog(null,"Prestamos: "+prestamos );
//        JOptionPane.showMessageDialog(null, "Salario Neto a recibir: "+sueldototal);




//                                        INTENTO N#2

/*
 desarrollar un algoritmo que calcule el salario neto que debe recibir un vendedor de un almacén. Se debe tener en cuenta si 
tiene derecho o no al auxilio de transporte. Para el desarrollo del ejercicio tenga en cuenta las siguientes formulas:
Sueldo devengado = salario básico * días laborados / 30.​
Días laborados = debe ser entre 1 y 30.​
Auxilio de Transporte: Lo reciben los empleados cuyo salario básico sea menor o igual a 2 salarios mínimos legales vigentes.​
                                        salario basico < salario basico*2
Salario Mínimo Legal Vigente (2017): 737.717
​Auxilio de Transporte = 83.140 * días laborados / 30 (año 2017 en Colombia)


Comisión de Ventas: En la empresa se tiene estipulado dar una comisión de ventas del 2% sobre las ventas del mes de cada vendedor.​

Total devengado = sueldo devengado + comisión de ventas.​

Total deducciones = descuentos por prestamos.​

Salario Neto = Total devengado – Total deducciones 
Como resultado del ejercicio se debe imprimir en pantalla lo siguiente:

 Cédula empleado: XXXXXX
 Nombre Empleado: XXXXXXX
 Salario Básico: XXXXXX
 Auxilio de Transporte: XXXXXX
 Comisión de Ventas: XXXXXX
 Préstamos: XXXXXX
 Salario Neto a Recibir: XXXXX​*/

                    String cedula= " ";
                    String nombre= " ";
                    double basico= 737.717;
                    double tranporte= 83.140;
                    int ventas= 0;
                    int prestamos= 0;
                    double salario= 0;
                    int dias=0;
                    double ayudatranporte=0;
                    double porsentaje=0;
                    double sueldo=0;
                   double porcientototal=0;
                   double descuentoprestamo=0;
                   double salariototal=0;
                   double total=0;
                   
                   
                    
                    cedula= JOptionPane.showInputDialog("Por favor ingrese la cedula ");
                    nombre= JOptionPane.showInputDialog("Por favor ingrese su nombre ");
                    
                 
                    do {
                        dias=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese los dias lavorados de 1 a 30"));
                    } while (dias >=30);
                    
                      sueldo=(basico*dias)/30;
                    
                        double a= basico*2;
                    if ( basico <= a){
                        ayudatranporte= (tranporte*dias)/30;                //auxilio de tranporte.......
                        
                    }
                    else {
                        ayudatranporte=0;
                    }
                    double sueldoa= sueldo+ayudatranporte; 
                  
                    
                    
                    ventas=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de ventas realizadas "));
                    
                    for (int i =0; i<= ventas; i++){
                        porsentaje=0.2*i;
                    }
                    porcientototal=sueldo*porsentaje;
                      total=sueldoa+porcientototal;
                     
                     prestamos=Integer.parseInt(JOptionPane.showInputDialog("Si tiene prestamos actuales coloque el valor"));
                     double valorTotal=prestamos-total;
                    
                    System.out.println("Cédula Empleado : " +cedula);
                    System.out.println("Nombre Empleado: " +nombre);
                    System.out.println("Salario Básico: " +Math.round(sueldo*100));
                    System.out.println("Auxilio de Transporte: " +Math.round(ayudatranporte*100));
                    System.out.println("Comisión de Ventas: "+ porcientototal);
                    System.out.println("Préstamos: "+ prestamos);
                    System.out.println("Salario Neto a Recibir: "+Math.round(valorTotal*100));
                    
                    
                    
//Cédula empleado: XXXXXX
// Nombre Empleado: XXXXXXX
// Salario Básico: XXXXXX
// Auxilio de Transporte: XXXXXX
// Comisión de Ventas: XXXXXX
// Préstamos: XXXXXX
// Salario Neto a Recibir: XXXXX​*/
    }           
    
}

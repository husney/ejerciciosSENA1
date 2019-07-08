/*---> 
dada la siguiente función:
Y= x^2 – 2x 
parte1 Finalizado
Se requiere desarrollar un algoritmo que imprima en pantalla, para valores de x desde 1 a 10, lo siguiente:
parte2
​La suma de todos los valores de Y.
parte3
Valores de Y múltiplos de 3.
parte4
Suma de los valores de Y múltiplos de 3.
parte5
Valores de Y cuyo último dígito sea 5.
parte6
Suma de los valores de Y cuyo último dígito es 5.
 */
package javaapplication43;

public class JavaApplication43 {


    public static void main(String[] args) {

        int a= 0;
        int b= 0;
        int y= 0;
        int suma=0;
        int suma3=0;
        int suma5=0;
        
        
        
        
        for ( int i=1; i<=10; i++){ //imprimir valores de 1 a 10
            
            a= (int)Math.pow(i, 2);            //x ala 2
            b= 2*i;                         //2*x
            y= a-b;                     //valor de Y 
            System.out.println(+i+ " Y: " +y);
            System.out.println("---------------------------------------------------------------------------");
            suma+= y;                           // suma de los valores de Y 
        }
        
        System.out.println("La suma de todos los valores de Y es: "+suma);
        System.out.println("---------------------------------------------------------------------------");
        
        for( int i=1; i <=10;i++ ){     
            if(i%3==0){                             //multiplos de 3
               suma3+= i;                               // suma de los multiplos de 3
                System.out.println( "impar:" +i );          
            }
        }
        System.out.println("la suma de los multiplos de 3 es: " + suma3);
        System.out.println("---------------------------------------------------------------------------");
        
        for ( int i=1; i<=10; i++){
            
            if(i%5==0){                             // multiplos de 5
                suma5+=i;                                   // suma de multiplos de 5
                System.out.println("Multiplo de 5: " + i);
            }
        }System.out.println("La suma de los multiplos de 5 es: " +suma5);
        System.out.println("---------------------------------------------------------------------------");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int a = 0;
//        int b = 0;
//        int y = 0;
//        int x = 0;
//
//        int suma = 0;
//
//        for (int i = 1; i <= 10; i++) {
//
//            a = (int) Math.pow(i, 2);
//            b = 2 * i;
//            y = a - b;
//            System.out.println(i + ": Y = " + y);
//            suma+=  y;
//            System.out.println("Suma temporal: "+suma);
//        }
//        System.out.println("Suma: "+suma);
//
//        for (int j = 0; j <= 10; j++) {
//            if (j % 3 == 0) {
//                suma += j;
//            System.out.println("Impar: " + j);
//            }
//        }
//        System.out.println("Suma total: " + suma);

//        int p = 223333345;
//        int var1 = 0;
//        String cifra = Integer.toString(p);
//
//        for (int k = 0; k <= 20; k++) {
//            if(k%5==0){
//            var1 += k;
//            }
//        }
//        System.out.println("var1: " + var1);
//        
//        char ultimoCaracter = cifra.charAt(cifra.length() - 1);
//        if (ultimoCaracter == '5') {
//            System.out.println(ultimoCaracter);
//            var1+=ultimoCaracter;
//            
//        } else {
//            System.out.println("Cifra diferente a 5");
//        }
//        System.out.println("tamaño: " + cifra.length());
//        System.out.println("c:" + c);

    }
}

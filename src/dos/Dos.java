/*
2. Escriba un algoritmo que permita calcular la hipotenusa de un triángulo 
rectángulo utilizando el teorema de Pitágoras.
 */
package dos;
import java.util.Scanner;
public class Dos {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        double cateto1;
        double cateto2;
        double hipotenusa;
        
        System.out.println("Ingrese el valor del cateto 1: ");
        cateto1 = lector.nextDouble();
        System.out.println("Ingrese el valor del cateto 2; ");
        cateto2 = lector.nextDouble();
        hipotenusa = Math.pow(cateto1, 2)+Math.pow(cateto2,2);
        hipotenusa = Math.sqrt(hipotenusa);
        System.out.println("Hipotenusa = " +hipotenusa);
       
    }
    
}

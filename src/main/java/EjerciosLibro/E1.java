/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EjerciosLibro;
import java.util.Scanner;
/**
 *
 * @author CARLOS
 */
public class E1 {


 public static void main(String[] args) {
 double a,b,c; // coeficientes ax^2+bx+c=0
 double x1,x2,d; // soluciones y determinante
  
 Scanner sc= new Scanner (System.in);
 System.out.println("Introduzca primer coeficiente (a):");
 a= sc.nextDouble();
 System.out.println("Introduzca segundo coeficiente: (b):");
 b= sc.nextDouble();
 System.out.println("Introduzca tercer coeficiente: (c):");
 c= sc.nextDouble();
 // calculamos el determinante
 d=((b*b)-4*a*c);
 if(d<0)
 System.out.println("No existen soluciones reales");
 else{
 // queda confirmar que a sea distinto de 0.
// si a=0 nos encontramos una división por cero.

 x1=(-b+Math.sqrt(d))/(2*a);
 x2=(-b-Math.sqrt(d))/(2*a);
 System.out.println("Solución: " + x1);
 System.out.println("Solución: " + x2);
 }
 }
}
    
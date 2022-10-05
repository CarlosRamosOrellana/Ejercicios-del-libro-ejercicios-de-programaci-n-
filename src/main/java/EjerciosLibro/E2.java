/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciosLibro;
import java.util.Scanner;
/**
 *
 * @author CARLOS
 */
public class E2 {
    
 public static void main(String[] args) {
 double a,r; // área y radio
  Scanner sc=new Scanner(System.in);
 System.out.print("Introduce el radio de un circulo: ");
 r= sc.nextDouble();
 a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)

 System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);

 }
}

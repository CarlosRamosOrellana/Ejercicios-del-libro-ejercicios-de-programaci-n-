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
public class Ej3 {
    
        public static void main(String[] args) {
 double l,r; // longitud y radio
 Scanner sc=new Scanner(System.in);
 System.out.print("Introduce el radio de una circunferencia: ");
 r=sc.nextDouble();
 l=2*Math.PI*r;

 System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
 }

}
   

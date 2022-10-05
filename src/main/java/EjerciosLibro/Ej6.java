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
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 int n1,n2;

 System.out.print("Introduce un número: ");
   n1=  (int) sc.nextDouble();
 System.out.print("Introduce otro número: ");
  n2=   (int) sc.nextDouble();
  if(n1%n2==0)
 System.out.println("Son múltiplos");
 else
 System.out.println("No son múltiplos");
 }
}


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
public class Eje10 {
    public static void main(String[] args) {
 int a,b,c;
 Scanner sc=new Scanner(System.in);
 System.out.print("Introduzca primer número: ");
 a=(int) sc.nextDouble();
 System.out.print("Introduzca segundo número: ");
 b=(int) sc.nextDouble();
 System.out.print("Introduzca tercer número: ");
 c=(int) sc.nextDouble();
 if(a>b && b>c)
 System.out.println( a+", "+b+", "+c);
 else{
 if(a>c && c>b)
 System.out.println(a+", "+c+", "+b);
}
    }
}
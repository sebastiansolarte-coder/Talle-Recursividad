package Recursividad;
import java.util.Scanner;
public class Principal { static long suma(int n){if(n<0)throw new IllegalArgumentException("n debe ser no negativo");return n==0?0:n+suma(n-1);} public static void main(String[] a){Scanner e=new Scanner(System.in);System.out.print("n: ");System.out.println("Sumatoria: "+suma(e.nextInt()));} }

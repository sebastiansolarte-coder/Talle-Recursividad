package Recursividad;
import java.util.Scanner;
public class Principal { static long suma(long n){n=Math.abs(n);return n<10?n:n%10+suma(n/10);} public static void main(String[] a){Scanner e=new Scanner(System.in);System.out.print("Número: ");System.out.println("Suma: "+suma(e.nextLong()));} }

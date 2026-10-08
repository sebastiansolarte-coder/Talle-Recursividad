package Recursividad;
import java.util.Scanner;
public class Principal { static double armonica(int n){if(n<=0)throw new IllegalArgumentException("n debe ser positivo");return n==1?1:1.0/n+armonica(n-1);} public static void main(String[] a){Scanner e=new Scanner(System.in);System.out.print("n: ");System.out.println("Suma: "+armonica(e.nextInt()));} }

package Recursividad;
import java.util.Scanner;
public class Principal { static long factorial(int n){if(n<0)throw new IllegalArgumentException("n debe ser no negativo");return n<=1?1:n*factorial(n-1);} public static void main(String[] a){Scanner e=new Scanner(System.in);System.out.print("n: ");System.out.println("Factorial: "+factorial(e.nextInt()));} }

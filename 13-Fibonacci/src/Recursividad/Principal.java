package Recursividad;
import java.util.Scanner;
public class Principal { static long fib(int n){if(n<0)throw new IllegalArgumentException("Límite no negativo");return n<2?n:fib(n-1)+fib(n-2);} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Límite: ");int n=s.nextInt();for(int i=0;i<=n;i++)System.out.print(fib(i)+(i==n?"\n":" "));} }

package Recursividad;
import java.util.Scanner;
public class Principal { static long invertir(long n,long r){return n==0?r:invertir(n/10,r*10+n%10);} public static void main(String[] a){Scanner e=new Scanner(System.in);System.out.print("Número: ");long n=e.nextLong();System.out.println("Invertido: "+invertir(Math.abs(n),0));} }

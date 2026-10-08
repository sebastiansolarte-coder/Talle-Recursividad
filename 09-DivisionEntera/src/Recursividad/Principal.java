package Recursividad;
import java.util.Scanner;
public class Principal { static int dividir(int a,int b){if(b<=0||a<0)throw new IllegalArgumentException("Use enteros no negativos y divisor positivo");return a<b?0:1+dividir(a-b,b);} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Dividendo: ");int x=s.nextInt();System.out.print("Divisor: ");System.out.println("Cociente: "+dividir(x,s.nextInt()));} }

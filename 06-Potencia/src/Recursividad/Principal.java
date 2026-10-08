package Recursividad;
import java.util.Scanner;
public class Principal { static long potencia(long b,int e){if(e<0)throw new IllegalArgumentException("Exponente no negativo");return e==0?1:b*potencia(b,e-1);} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Base: ");long b=s.nextLong();System.out.print("Exponente: ");System.out.println("Resultado: "+potencia(b,s.nextInt()));} }

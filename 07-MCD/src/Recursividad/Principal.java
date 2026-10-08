package Recursividad;
import java.util.Scanner;
public class Principal { static int mcd(int m,int n){m=Math.abs(m);n=Math.abs(n);return n==0?m:mcd(n,m%n);} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("M: ");int m=s.nextInt();System.out.print("N: ");System.out.println("MCD: "+mcd(m,s.nextInt()));} }

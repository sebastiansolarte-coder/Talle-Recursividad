package Recursividad;
import java.util.Scanner;
public class Principal { static int multiplicar(int a,int b){if(b<0)return -multiplicar(a,-b);return b==0?0:a+multiplicar(a,b-1);} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Primer número: ");int x=s.nextInt();System.out.print("Segundo número: ");System.out.println("Producto: "+multiplicar(x,s.nextInt()));} }

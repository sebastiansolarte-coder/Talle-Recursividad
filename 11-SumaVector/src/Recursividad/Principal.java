package Recursividad;
import java.util.Scanner;
public class Principal { static int suma(int[] v,int i){return i==v.length?0:v[i]+suma(v,i+1);} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Cantidad: ");int[] v=new int[s.nextInt()];for(int i=0;i<v.length;i++){System.out.print("Valor "+(i+1)+": ");v[i]=s.nextInt();}System.out.println("Suma: "+suma(v,0));} }

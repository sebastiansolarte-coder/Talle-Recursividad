package Recursividad;
import java.util.Scanner;
public class Principal { static long ackermann(int m,int n){if(m<0||n<0)throw new IllegalArgumentException("Valores no negativos");if(m==0)return n+1;if(n==0)return ackermann(m-1,1);return ackermann(m-1,(int)ackermann(m,n-1));} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("m: ");int m=s.nextInt();System.out.print("n: ");System.out.println("Ackermann: "+ackermann(m,s.nextInt()));} }

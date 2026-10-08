package Recursividad;
import java.util.Scanner;
public class Principal { static int suma(int[][] m,int f,int c){if(f==m.length)return 0;if(c==m[f].length)return suma(m,f+1,0);return m[f][c]+suma(m,f,c+1);} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Filas: ");int f=s.nextInt();System.out.print("Columnas: ");int c=s.nextInt();int[][] m=new int[f][c];for(int i=0;i<f;i++)for(int j=0;j<c;j++){System.out.print("["+i+"]["+j+"]: ");m[i][j]=s.nextInt();}System.out.println("Suma: "+suma(m,0,0));} }

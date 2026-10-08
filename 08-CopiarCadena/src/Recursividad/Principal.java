package Recursividad;
import java.util.Scanner;
public class Principal { static String copiar(String t){return t.isEmpty()?"":t.charAt(0)+copiar(t.substring(1));} public static void main(String[] a){Scanner s=new Scanner(System.in);System.out.print("Cadena: ");System.out.println("Copia: "+copiar(s.nextLine()));} }

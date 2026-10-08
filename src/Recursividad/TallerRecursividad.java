package Recursividad;

import java.util.Scanner;

/** Menú de consola para ejecutar los ejercicios del taller. */
public class TallerRecursividad {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = entero("Opción: ");
            try { ejecutar(opcion); } catch (RuntimeException e) { System.out.println("Error: " + e.getMessage()); }
        } while (opcion != 0);
    }

    private static void menu() {
        System.out.println("\n--- TALLER DE RECURSIVIDAD ---");
        System.out.println("1 Factorial | 2 Sumatoria | 3 Serie armónica | 4 Invertir número");
        System.out.println("5 Sumar dígitos | 6 Potencia | 7 MCD | 8 Copiar cadena");
        System.out.println("9 División entera | 10 Multiplicación | 11 Sumar vector | 12 Sumar matriz");
        System.out.println("13 Fibonacci | 14 Ackermann | 0 Salir");
    }

    private static void ejecutar(int o) {
        int n, m;
        switch (o) {
            case 0 -> System.out.println("Fin del programa.");
            case 1 -> System.out.println("Resultado: " + FuncionesRecursivas.factorial(entero("n: ")));
            case 2 -> System.out.println("Resultado: " + FuncionesRecursivas.sumatoria(entero("n: ")));
            case 3 -> System.out.println("Resultado: " + FuncionesRecursivas.sumaArmonica(entero("n: ")));
            case 4 -> System.out.println("Resultado: " + FuncionesRecursivas.invertirNumero(entero("Número: ")));
            case 5 -> System.out.println("Resultado: " + FuncionesRecursivas.sumaDigitos(entero("Número: ")));
            case 6 -> System.out.println("Resultado: " + FuncionesRecursivas.potencia(entero("Base: "), entero("Exponente: ")));
            case 7 -> System.out.println("Resultado: " + FuncionesRecursivas.mcd(entero("M: "), entero("N: ")));
            case 8 -> { System.out.print("Cadena: "); System.out.println("Copia: " + FuncionesRecursivas.copiarCadena(ENTRADA.nextLine())); }
            case 9 -> System.out.println("Cociente: " + FuncionesRecursivas.divisionEntera(entero("Dividendo: "), entero("Divisor: ")));
            case 10 -> System.out.println("Resultado: " + FuncionesRecursivas.multiplicacion(entero("Primer número: "), entero("Segundo número: ")));
            case 11 -> { n = entero("Cantidad: "); int[] v = new int[n]; for (int i=0;i<n;i++) v[i]=entero("Valor " + (i+1) + ": "); System.out.println("Suma: " + FuncionesRecursivas.sumaVector(v)); }
            case 12 -> { m=entero("Filas: "); n=entero("Columnas: "); int[][] a=new int[m][n]; for(int i=0;i<m;i++) for(int j=0;j<n;j++) a[i][j]=entero("["+i+"]["+j+"]: "); System.out.println("Suma: "+FuncionesRecursivas.sumaMatriz(a)); }
            case 13 -> { n=entero("Límite: "); for(int i=0;i<=n;i++) System.out.print(FuncionesRecursivas.fibonacci(i)+(i==n?"\n":" ")); }
            case 14 -> System.out.println("Resultado: " + FuncionesRecursivas.ackermann(entero("m: "), entero("n: ")));
            default -> System.out.println("Opción no válida.");
        }
    }
    private static int entero(String mensaje) { System.out.print(mensaje); while(!ENTRADA.hasNextInt()){ENTRADA.next();System.out.print("Ingrese un entero: ");} int v=ENTRADA.nextInt(); ENTRADA.nextLine(); return v; }
}

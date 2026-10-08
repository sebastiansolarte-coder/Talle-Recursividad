package Recursividad;

/** Operaciones del taller implementadas mediante recursividad. */
public final class FuncionesRecursivas {
    private FuncionesRecursivas() { }

    public static long factorial(int n) {
        validarNoNegativo(n, "n");
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    public static long sumatoria(int n) {
        validarNoNegativo(n, "n");
        return n == 0 ? 0 : n + sumatoria(n - 1);
    }

    public static double sumaArmonica(int n) {
        validarPositivo(n, "n");
        return n == 1 ? 1.0 : 1.0 / n + sumaArmonica(n - 1);
    }

    public static long invertirNumero(long n) {
        long signo = n < 0 ? -1 : 1;
        return signo * invertirPositivo(Math.abs(n), 0);
    }

    private static long invertirPositivo(long n, long resultado) {
        return n == 0 ? resultado : invertirPositivo(n / 10, resultado * 10 + n % 10);
    }

    public static long sumaDigitos(long n) {
        n = Math.abs(n);
        return n < 10 ? n : n % 10 + sumaDigitos(n / 10);
    }

    public static long potencia(long base, int exponente) {
        validarNoNegativo(exponente, "exponente");
        return exponente == 0 ? 1 : base * potencia(base, exponente - 1);
    }

    public static int mcd(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        return n == 0 ? m : mcd(n, m % n);
    }

    public static String copiarCadena(String texto) {
        if (texto == null || texto.isEmpty()) return texto == null ? "" : texto;
        return texto.charAt(0) + copiarCadena(texto.substring(1));
    }

    public static int divisionEntera(int dividendo, int divisor) {
        if (divisor == 0) throw new ArithmeticException("No se puede dividir entre cero.");
        if (dividendo < 0 || divisor < 0) throw new IllegalArgumentException("Use enteros no negativos.");
        return dividendo < divisor ? 0 : 1 + divisionEntera(dividendo - divisor, divisor);
    }

    public static int multiplicacion(int a, int b) {
        if (b < 0) return -multiplicacion(a, -b);
        return b == 0 ? 0 : a + multiplicacion(a, b - 1);
    }

    public static int sumaVector(int[] vector) { return sumaVector(vector, 0); }
    private static int sumaVector(int[] vector, int indice) {
        return indice == vector.length ? 0 : vector[indice] + sumaVector(vector, indice + 1);
    }

    public static int sumaMatriz(int[][] matriz) { return sumaMatriz(matriz, 0, 0); }
    private static int sumaMatriz(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) return 0;
        if (columna == matriz[fila].length) return sumaMatriz(matriz, fila + 1, 0);
        return matriz[fila][columna] + sumaMatriz(matriz, fila, columna + 1);
    }

    public static long fibonacci(int n) {
        validarNoNegativo(n, "n");
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long ackermann(int m, int n) {
        validarNoNegativo(m, "m");
        validarNoNegativo(n, "n");
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, (int) ackermann(m, n - 1));
    }

    private static void validarNoNegativo(int valor, String nombre) {
        if (valor < 0) throw new IllegalArgumentException(nombre + " debe ser no negativo.");
    }
    private static void validarPositivo(int valor, String nombre) {
        if (valor <= 0) throw new IllegalArgumentException(nombre + " debe ser positivo.");
    }
}

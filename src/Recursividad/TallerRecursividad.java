package Recursividad;

import java.util.Scanner;

public class TallerRecursividad {

    // 1. 
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 2. 
    public static int invertirNumero(int n, int invertido) {
        if (n == 0) return invertido;
        return invertirNumero(n / 10, invertido * 10 + n % 10);
    }

    // 3.
    public static double sumatoriaArmonica(int n) {
        if (n == 1) return 1.0;
        return (1.0 / n) + sumatoriaArmonica(n - 1);
    }

    // 4.
    public static int sumarDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumarDigitos(n / 10);
    }

    // 5.
    public static int sumatoriaHastaN(int n) {
        if (n <= 1) return n;
        return n + sumatoriaHastaN(n - 1);
    }

    // 6.
    public static long potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    // 7.
    public static int mcd(int m, int n) {
        if (n == 0) return m;
        return mcd(n, m % n);
    }

    // 8.
    public static String copiarCadena(String origen, int indice) {
        if (indice == origen.length()) return "";
        return origen.charAt(indice) + copiarCadena(origen, indice + 1);
    }

    // 9.
    public static int cocienteRestas(int dividendo, int divisor) {
        if (dividendo < divisor) return 0;
        return 1 + cocienteRestas(dividendo - divisor, divisor);
    }

    // 10.
    public static int multiplicacionSumas(int a, int b) {
        if (b == 0) return 0;
        if (b < 0) return -multiplicacionSumas(a, -b);
        return a + multiplicacionSumas(a, b - 1);
    }

    // 11. 
    public static int sumarArreglo(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + sumarArreglo(arr, n - 1);
    }

    // 12.
    public static int sumarMatriz(int[][] matriz, int fila, int col) {
        if (fila >= matriz.length) return 0;
        if (col >= matriz[0].length) return sumarMatriz(matriz, fila + 1, 0);
        return matriz[fila][col] + sumarMatriz(matriz, fila, col + 1);
    }

    // 13. 
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void imprimirFibonacciHastaLimite(int limite, int n) {
        int val = fibonacci(n);
        if (val > limite) return;
        System.out.print(val + " ");
        imprimirFibonacciHastaLimite(limite, n + 1);
    }

    // 14. 
    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (m > 0 && n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TALLER DE RECURSIVIDAD EN JAVA ===");

        // P1:
        System.out.println("\n1. Factorial de 5: " + factorial(5));

        // P2: 
        System.out.println("2. Invertir 123: " + invertirNumero(123, 0));

        // P3: 
        System.out.printf("3. Sumatoria armónica hasta n=3: %.4f\n", sumatoriaArmonica(3));

        // P4:
        System.out.println("4. Sumar dígitos de 123: " + sumarDigitos(123));

        // P5:
        System.out.println("5. Sumatoria hasta 5: " + sumatoriaHastaN(5));

        // P6: 
        System.out.println("6. Potencia 2^3: " + potencia(2, 3));

        // P7:
        System.out.println("7. MCD de 48 y 18: " + mcd(48, 18));

        // P8: 
        String texto = "Hola Recursividad";
        System.out.println("8. Copia de cadena: " + copiarCadena(texto, 0));

        // P9: 
        System.out.println("9. Cociente de 10 / 3 (restas): " + cocienteRestas(10, 3));

        // P10:
        System.out.println("10. Multiplicación de 4 * 3 (sumas): " + multiplicacionSumas(4, 3));

        // P11: 
        int[] vector = {1, 2, 3, 4, 5};
        System.out.println("11. Suma de elementos del vector: " + sumarArreglo(vector, vector.length));

        // P12: 
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("12. Suma de elementos de la matriz 2x3: " + sumarMatriz(matriz, 0, 0));

        // P13: 
        System.out.print("13. Serie de Fibonacci hasta límite 20: ");
        imprimirFibonacciHastaLimite(20, 0);
        System.out.println();

        // P14: 
        System.out.println("14. Ackermann(1, 2): " + ackermann(1, 2));

        scanner.close();
    }
}
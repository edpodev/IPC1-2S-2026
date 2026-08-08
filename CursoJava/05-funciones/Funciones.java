public class Funciones {

    // Recibe dos int, retorna un int
    static int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: mismo nombre "sumar", distinta firma (3 parámetros)
    static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Retorna un boolean
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Función recursiva: se llama a sí misma hasta un caso base
    static int factorial(int n) {
        if (n <= 1) return 1;        // caso base
        return n * factorial(n - 1); // llamada recursiva
    }

    public static void main(String[] args) {
        System.out.println("sumar(2,3) = " + sumar(2, 3));
        System.out.println("sumar(2,3,4) = " + sumar(2, 3, 4));
        System.out.println("esPar(10) = " + esPar(10));
        System.out.println("factorial(5) = " + factorial(5));
    }
}

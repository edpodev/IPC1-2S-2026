public class Matrices {
    public static void main(String[] args) {

        // Matriz 3x3 inicializada directamente
        int[][] tablero = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elemento fila 1, columna 2: " + tablero[1][2]); // 6

        // Recorrido con dos for anidados
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        // Matriz declarada vacía y llenada después
        int filas = 2, columnas = 4;
        double[][] notas = new double[filas][columnas];
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                notas[f][c] = (f + 1) * (c + 1); // valor de ejemplo
            }
        }
        System.out.println("notas[1][3] = " + notas[1][3]);

        // Forma "new" explícita, válida en cualquier lado (igual que en arreglos)
        int[][] explicita;
        explicita = new int[][]{{1, 2}, {3, 4}};
        System.out.println("explicita[1][0] = " + explicita[1][0]);

        // Matriz irregular (jagged): cada fila con su propio tamaño
        int[][] irregular = new int[3][]; // 3 filas, todavía en null
        irregular[0] = new int[]{1};
        irregular[1] = new int[]{1, 2};
        irregular[2] = new int[]{1, 2, 3};
        for (int fila = 0; fila < irregular.length; fila++) {
            System.out.println("fila " + fila + " tiene " + irregular[fila].length + " columnas");
        }
    }
}

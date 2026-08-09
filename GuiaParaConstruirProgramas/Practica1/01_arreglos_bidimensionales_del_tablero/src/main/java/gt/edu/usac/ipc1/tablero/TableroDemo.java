package gt.edu.usac.ipc1.tablero;

public class TableroDemo {

    static final int FILAS = 6;
    static final int COLUMNAS = 6;
    static final char SIMBOLO_BORDE = '=';
    static final char SIMBOLO_LIBRE = 'L';

    public static void main(String[] args) {
        char[][] tablero = new char[FILAS][COLUMNAS];
        llenarTablero(tablero);
        imprimirTablero(tablero);
    }

    static void llenarTablero(char[][] tablero) {
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                tablero[fila][columna] = esBorde(fila, columna) ? SIMBOLO_BORDE : SIMBOLO_LIBRE;
            }
        }
    }

    static boolean esBorde(int fila, int columna) {
        return fila == 0 || fila == FILAS - 1 || columna == 0 || columna == COLUMNAS - 1;
    }

    static void imprimirTablero(char[][] tablero) {
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}

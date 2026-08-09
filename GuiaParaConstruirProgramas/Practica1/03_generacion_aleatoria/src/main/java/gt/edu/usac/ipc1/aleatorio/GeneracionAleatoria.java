package gt.edu.usac.ipc1.aleatorio;

import java.util.Random;

public class GeneracionAleatoria {

    static final int FILAS = 6;
    static final int COLUMNAS = 6;

    public static void main(String[] args) {
        Random rnd = new Random();

        int[] entrada = generarPosicionEnBorde(rnd);
        System.out.println("Entrada: fila " + entrada[0] + ", columna " + entrada[1]);

        // Sugerencia: para la salida, llama de nuevo a generarPosicionEnBorde(rnd) y,
        // si el resultado coincide con "entrada" (misma fila y misma columna), volve
        // a generarlo -- es el mismo patron "generar de nuevo mientras no cumpla la
        // condicion" que usarias para evitar una placa duplicada o un espacio ocupado.
    }

    // Elige uno de los 4 lados del borde y genera la coordenada que falta dentro de
    // ese lado, evitando las esquinas.
    static int[] generarPosicionEnBorde(Random rnd) {
        int lado = rnd.nextInt(4);

        int fila;
        int columna;

        switch (lado) {
            case 0:
                fila = 0;
                columna = 1 + rnd.nextInt(COLUMNAS - 2);
                break;
            case 1:
                fila = FILAS - 1;
                columna = 1 + rnd.nextInt(COLUMNAS - 2);
                break;
            case 2:
                columna = 0;
                fila = 1 + rnd.nextInt(FILAS - 2);
                break;
            default:
                columna = COLUMNAS - 1;
                fila = 1 + rnd.nextInt(FILAS - 2);
                break;
        }

        return new int[]{fila, columna};
    }
}

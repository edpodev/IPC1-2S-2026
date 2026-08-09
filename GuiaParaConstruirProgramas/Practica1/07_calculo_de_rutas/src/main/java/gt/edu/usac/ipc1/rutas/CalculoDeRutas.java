package gt.edu.usac.ipc1.rutas;

public class CalculoDeRutas {

    static final int FILAS = 4;
    static final int COLUMNAS = 5;
    static final int TOTAL_PERIMETRO = 2 * FILAS + 2 * COLUMNAS - 4;

    public static void main(String[] args) {
        int[] filaPerimetro = new int[TOTAL_PERIMETRO];
        int[] columnaPerimetro = new int[TOTAL_PERIMETRO];
        construirPerimetro(filaPerimetro, columnaPerimetro);

        int filaEntrada = 0, columnaEntrada = 2;
        int filaSalida = 3, columnaSalida = 1;

        calcularYMostrarRuta(filaPerimetro, columnaPerimetro,
                filaEntrada, columnaEntrada, filaSalida, columnaSalida);
    }

    // Recorre el borde en sentido horario, arrancando en la esquina (0,0):
    // arriba (izq->der), derecha (arriba->abajo), abajo (der->izq), izquierda (abajo->arriba).
    // Cada tramo arranca justo donde termino el anterior, sin repetir esquinas.
    static void construirPerimetro(int[] filaPerimetro, int[] columnaPerimetro) {
        int indice = 0;

        for (int columna = 0; columna < COLUMNAS; columna++) {
            filaPerimetro[indice] = 0;
            columnaPerimetro[indice] = columna;
            indice++;
        }
        for (int fila = 1; fila < FILAS; fila++) {
            filaPerimetro[indice] = fila;
            columnaPerimetro[indice] = COLUMNAS - 1;
            indice++;
        }
        for (int columna = COLUMNAS - 2; columna >= 0; columna--) {
            filaPerimetro[indice] = FILAS - 1;
            columnaPerimetro[indice] = columna;
            indice++;
        }
        for (int fila = FILAS - 2; fila >= 1; fila--) {
            filaPerimetro[indice] = fila;
            columnaPerimetro[indice] = 0;
            indice++;
        }
    }

    static int buscarIndiceEnPerimetro(int[] filaPerimetro, int[] columnaPerimetro,
                                        int filaBuscada, int columnaBuscada) {
        for (int i = 0; i < filaPerimetro.length; i++) {
            if (filaPerimetro[i] == filaBuscada && columnaPerimetro[i] == columnaBuscada) {
                return i;
            }
        }
        return -1;
    }

    static void calcularYMostrarRuta(int[] filaPerimetro, int[] columnaPerimetro,
                                      int filaEntrada, int columnaEntrada,
                                      int filaSalida, int columnaSalida) {

        int indiceEntrada = buscarIndiceEnPerimetro(filaPerimetro, columnaPerimetro, filaEntrada, columnaEntrada);
        int indiceSalida = buscarIndiceEnPerimetro(filaPerimetro, columnaPerimetro, filaSalida, columnaSalida);
        int total = filaPerimetro.length;

        // "+ total" antes del modulo evita un resultado negativo cuando el indice
        // de salida queda antes que el de entrada dentro del arreglo.
        int distanciaHoraria = (indiceSalida - indiceEntrada + total) % total;
        int distanciaAntihoraria = (indiceEntrada - indiceSalida + total) % total;

        System.out.println("Entrada: fila " + filaEntrada + ", columna " + columnaEntrada);
        System.out.println("Salida: fila " + filaSalida + ", columna " + columnaSalida);
        System.out.println("Distancia horaria: " + distanciaHoraria + " posiciones");
        System.out.println("Distancia antihoraria: " + distanciaAntihoraria + " posiciones");

        if (distanciaHoraria < distanciaAntihoraria) {
            System.out.println("Ruta recomendada: sentido horario (" + distanciaHoraria + " posiciones)");
        } else if (distanciaAntihoraria < distanciaHoraria) {
            System.out.println("Ruta recomendada: sentido antihorario (" + distanciaAntihoraria + " posiciones)");
        } else {
            System.out.println("Ambas rutas tienen la misma distancia, cualquiera puede utilizarse.");
        }
    }
}

package gt.edu.usac.ipc1.matrices;

public class VerificacionDeDisponibilidad {

    static final char LIBRE = 'L';
    static final char OCUPADO = 'O';

    public static void main(String[] args) {
        char[][] espacios = {
                {OCUPADO, OCUPADO, OCUPADO},
                {OCUPADO, LIBRE, OCUPADO},
                {OCUPADO, OCUPADO, OCUPADO},
        };

        System.out.println("Posicion (1,1) libre: " + esPosicionLibre(espacios, 1, 1));
        System.out.println("Hay al menos un espacio libre: " + hayEspacioLibre(espacios));

        // Sugerencia: a partir de este mismo recorrido se pueden construir otras
        // operaciones -- mostrar la matriz completa con encabezados, o contar
        // cuantas posiciones estan libres y cuantas ocupadas mientras se recorre.
    }

    static boolean esPosicionLibre(char[][] espacios, int fila, int columna) {
        return espacios[fila][columna] == LIBRE;
    }

    // Recorre la matriz y se detiene apenas encuentra un espacio libre --
    // no hace falta seguir revisando el resto una vez que ya se sabe la respuesta.
    static boolean hayEspacioLibre(char[][] espacios) {
        for (int fila = 0; fila < espacios.length; fila++) {
            for (int columna = 0; columna < espacios[fila].length; columna++) {
                if (espacios[fila][columna] == LIBRE) {
                    return true;
                }
            }
        }
        return false;
    }
}

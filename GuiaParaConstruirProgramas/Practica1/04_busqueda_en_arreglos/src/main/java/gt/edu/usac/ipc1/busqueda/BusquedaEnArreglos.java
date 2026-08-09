package gt.edu.usac.ipc1.busqueda;

public class BusquedaEnArreglos {

    public static void main(String[] args) {
        // Arreglos paralelos: la posicion i de "codigos" describe al mismo
        // elemento que la posicion i de "cantidades".
        String[] codigos = {"A10", "B20", "C30", "D40"};
        int[] cantidades = {5, 12, 0, 8};

        buscarEImprimir(codigos, cantidades, "C30");
        buscarEImprimir(codigos, cantidades, "Z99");
    }

    static void buscarEImprimir(String[] codigos, int[] cantidades, String buscado) {
        int posicion = buscarPosicion(codigos, buscado);

        if (posicion == -1) {
            System.out.println(buscado + " -> no encontrado");
        } else {
            System.out.println(buscado + " -> encontrado en posicion " + posicion
                    + ", cantidad = " + cantidades[posicion]);
        }
    }

    // -1 como senal de "no encontrado": nunca es un indice valido de un arreglo.
    //
    // Sugerencia: si en algun caso solo necesitas saber si existe (sin la posicion),
    // la misma idea se resuelve con una variable booleana en vez de "return i".
    static int buscarPosicion(String[] codigos, String buscado) {
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i].equals(buscado)) {
                return i;
            }
        }
        return -1;
    }
}

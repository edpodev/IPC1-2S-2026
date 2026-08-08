public class Arreglos {
    public static void main(String[] args) {

        // --- formas de declarar/crear un arreglo ---

        // 1. Vacío, con tamaño fijo: Java rellena con el valor por defecto
        int[] vacios = new int[5];
        String[] referencias = new String[2];
        System.out.println("vacios[0] por defecto: " + vacios[0]);        // 0
        System.out.println("referencias[0] por defecto: " + referencias[0]); // null

        // 2. Literal corto, en la misma línea de la declaración
        int[] edades = {23, 45, 31, 19, 62};

        // 3. Forma "new" explícita: sirve para crear el arreglo en cualquier momento
        int[] explicito;
        explicito = new int[]{7, 8, 9};
        System.out.println("explicito[1] = " + explicito[1]);

        // Declaración con tamaño fijo, se llena después con asignaciones sueltas
        String[] nombres = new String[3];
        nombres[0] = "Ana";
        nombres[1] = "Luis";
        nombres[2] = "Marta";

        System.out.println("Primer edad: " + edades[0]);
        System.out.println("Cantidad de nombres: " + nombres.length);

        // Recorrido con for clásico (se necesita el índice)
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades[" + i + "] = " + edades[i]);
        }

        // Recorrido con for-each (más simple si no se necesita el índice)
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        System.out.println("Promedio de edad: " + (suma / (double) edades.length));

        // Dos variables pueden apuntar AL MISMO arreglo (paso por referencia)
        int[] copiaReferencia = edades;
        copiaReferencia[0] = 999;
        System.out.println("edades[0] también cambió: " + edades[0]); // 999
    }
}

public class TiposDatos {
    public static void main(String[] args) {
        byte edad = 25;
        short año = 2026;
        int poblacion = 17_000_000;      // los guiones bajos solo mejoran lectura
        long distanciaKm = 384_400_000L; // Tierra-Luna en metros, cabe en long

        float precioAprox = 19.99f;
        double precioExacto = 19.999999;

        char inicial = 'D';
        boolean esMayorDeEdad = edad >= 18;

        String nombre = "Erick"; // tipo de referencia, no primitivo

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " | Mayor de edad: " + esMayorDeEdad);
        System.out.println("Inicial: " + inicial);
        System.out.println("Precio aprox: " + precioAprox + " | exacto: " + precioExacto);

        // Conversión (casting): de tipo "grande" a "chico" se pierde precisión
        double pi = 3.14159;
        int piEntero = (int) pi; // 3, trunca, no redondea
        System.out.println("pi truncado: " + piEntero);

        // Clásico tropiezo con punto flotante
        double suma = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3 -> " + (suma == 0.3));
    }
}

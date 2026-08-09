package gt.edu.usac.ipc1.metodos;

public class MetodosYModularizacion {

    public static void main(String[] args) {
        int[] notas = {65, 90, 45, 78, 88, 30, 100};

        double promedio = calcularPromedio(notas);
        int aprobados = contarAprobados(notas, 61);

        imprimirReporte(notas, promedio, aprobados);
    }

    static double calcularPromedio(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length; // el cast evita division entera
    }

    // notaMinima como parametro, no fijo: el mismo metodo sirve con otro criterio
    // sin tocar su codigo interno.
    static int contarAprobados(int[] notas, int notaMinima) {
        int contador = 0;
        for (int nota : notas) {
            if (nota >= notaMinima) {
                contador++;
            }
        }
        return contador;
    }

    static void imprimirReporte(int[] notas, double promedio, int aprobados) {
        System.out.println("Cantidad de notas: " + notas.length);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + (notas.length - aprobados));
    }
}

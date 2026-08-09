package gt.edu.usac.ipc1.menu;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuarEjecucion = true;

        do {
            mostrarMenu();
            int opcion = teclado.nextInt(); // sugerencia: validar con teclado.hasNextInt() antes de leer

            switch (opcion) {
                case 1:
                    System.out.println("-> Aqui iria la logica para ingresar un vehiculo.");
                    break;
                case 2:
                    System.out.println("-> Aqui iria la logica para retirar un vehiculo.");
                    break;
                case 3:
                    System.out.println("-> Aqui iria la logica para mostrar el estacionamiento.");
                    break;
                case 4:
                    System.out.println("-> Aqui iria la logica para buscar por placa.");
                    break;
                case 5:
                    System.out.println("-> Aqui iria la logica para calcular la ruta mas corta.");
                    break;
                case 6:
                    System.out.println("-> Aqui iria la logica para mostrar los ingresos.");
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    continuarEjecucion = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Debe ingresar un numero del 1 al 7.");
            }

        } while (continuarEjecucion);

        teclado.close();
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("===== SISTEMA DE ESTACIONAMIENTO =====");
        System.out.println("1. Ingresar vehiculo");
        System.out.println("2. Retirar vehiculo");
        System.out.println("3. Mostrar estacionamiento");
        System.out.println("4. Buscar vehiculo por placa");
        System.out.println("5. Mostrar ruta mas corta entre entrada y salida");
        System.out.println("6. Mostrar ingresos");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opcion: ");
    }
}

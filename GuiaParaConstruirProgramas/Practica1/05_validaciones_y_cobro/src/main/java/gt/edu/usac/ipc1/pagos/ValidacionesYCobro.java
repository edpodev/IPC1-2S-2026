package gt.edu.usac.ipc1.pagos;

import java.util.Scanner;

public class ValidacionesYCobro {

    static final double TARIFA = 10.00;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // En un caso real, estas tres banderas saldrian de tus propios metodos
        // de validacion (formato, rango, disponibilidad). Aqui quedan fijas
        // solo para mostrar como se encadenan antes de llegar al cobro.
        boolean datoValido = true;
        boolean posicionEnRango = true;
        boolean espacioLibre = true;

        if (!datoValido) {
            System.out.println("El dato ingresado no es valido.");
        } else if (!posicionEnRango) {
            System.out.println("La posicion esta fuera de rango.");
        } else if (!espacioLibre) {
            System.out.println("Ese espacio ya esta ocupado.");
        } else {
            double montoEntregado = solicitarPago(teclado);
            System.out.println("Pago recibido: Q" + montoEntregado);

            // Sugerencia: con montoEntregado y TARIFA ya validados (montoEntregado
            // >= TARIFA), el cambio es simplemente la resta entre ambos. Intenta
            // agregar esa linea y mostrarla junto con la confirmacion del registro.
        }

        teclado.close();
    }

    // Pide el monto entregado hasta que alcance para cubrir la tarifa.
    static double solicitarPago(Scanner teclado) {
        double montoEntregado;

        do {
            System.out.print("Tarifa: Q" + TARIFA + ". Ingrese el monto entregado: Q");
            montoEntregado = teclado.nextDouble();

            if (montoEntregado < 0) {
                System.out.println("El monto no puede ser negativo.");
            } else if (montoEntregado < TARIFA) {
                System.out.println("Pago insuficiente. Ingrese nuevamente.");
            }

        } while (montoEntregado < 0 || montoEntregado < TARIFA);

        return montoEntregado;
    }
}

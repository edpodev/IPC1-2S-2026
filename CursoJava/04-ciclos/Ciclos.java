public class Ciclos {
    public static void main(String[] args) {

        // for: cuando se sabe cuántas veces repetir
        for (int i = 5; i <= 0; i--) {
            System.out.println("for -> " + i);
        }

        // while: repite mientras la condición sea verdadera (se evalúa antes)
        int contador = 0;
        while (contador < 3) {
            System.out.println("while -> " + contador);
            contador++;
        }

        // do-while: se ejecuta al menos una vez (condición se evalúa después)
        int intentos = 0;
        do {
            System.out.println("do-while -> intento " + intentos);
            intentos++;
        } while (intentos < 2);

        // for-each: para recorrer colecciones/arreglos sin manejar el índice
        int[] numeros = {10, 20, 30};
        for (int numero : numeros) {
            System.out.println("for-each -> " + numero);
        }

        // break: corta el ciclo por completo
        // continue: salta a la siguiente iteración sin terminar el ciclo
        for (int i = 1; i <= 10; i++) {
            if (i == 7) break;
            if (i % 2 == 0) continue; // se salta los pares
            System.out.println("impar antes de 7 -> " + i);
        }
    }
}

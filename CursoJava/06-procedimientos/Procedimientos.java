public class Procedimientos {

    // void: no retorna nada, solo ejecuta una acción
    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    static void imprimirTabla(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        saludar("Erick");
        imprimirTabla(7);
    }
}

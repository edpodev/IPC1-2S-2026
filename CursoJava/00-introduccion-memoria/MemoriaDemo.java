public class MemoriaDemo {
    public static void main(String[] args) {
        // --- primitivos: valor, viven en el stack ---
        int a = 5;
        int b = a; // copia el valor
        b = 99;
        System.out.println("a = " + a + " | b = " + b); // a no cambió: son copias independientes

        // --- arreglos: referencia, el objeto vive en el heap ---
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;      // arr2 apunta al MISMO objeto que arr1
        int[] arr3 = {1, 2, 3}; // arr3 es un objeto DISTINTO, aunque tenga los mismos valores

        System.out.println("arr1 -> " + arr1); // algo como [I@6d06d69c
        System.out.println("arr2 -> " + arr2); // exactamente el mismo texto que arr1
        System.out.println("arr3 -> " + arr3); // texto distinto: es otro objeto en el heap

        arr2[0] = 999;
        System.out.println("arr1[0] también cambió: " + arr1[0]); // 999, mismo objeto
        System.out.println("arr3[0] sigue igual: " + arr3[0]);    // 1, objeto aparte
    }
}

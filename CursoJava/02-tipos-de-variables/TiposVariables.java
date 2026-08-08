public class TiposVariables {

    static int contadorDeCuentas = 0; // variable de clase: compartida por todas las instancias

    String titular;       // variable de instancia: cada cuenta tiene la suya
    double saldo;          // variable de instancia

    static final double TASA_INTERES = 0.02; // constante de clase

    TiposVariables(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        contadorDeCuentas++; // afecta a la única copia compartida
    }

    void aplicarInteres() {
        double interesGanado = saldo * TASA_INTERES; // variable local
        saldo += interesGanado;
    }

    public static void main(String[] args) {
        TiposVariables cuenta1 = new TiposVariables("Ana", 1000);
        TiposVariables cuenta2 = new TiposVariables("Luis", 500);

        cuenta1.aplicarInteres();

        System.out.println(cuenta1.titular + " saldo: " + cuenta1.saldo);
        System.out.println(cuenta2.titular + " saldo: " + cuenta2.saldo); // no cambió
        System.out.println("Cuentas creadas (variable de clase): " + contadorDeCuentas);
    }
}

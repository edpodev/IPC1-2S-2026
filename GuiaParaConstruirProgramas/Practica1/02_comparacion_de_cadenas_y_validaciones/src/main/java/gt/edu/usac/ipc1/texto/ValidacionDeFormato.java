package gt.edu.usac.ipc1.texto;

public class ValidacionDeFormato {

    static final int LONGITUD_MINIMA = 4;
    static final int LONGITUD_MAXIMA = 12;

    public static void main(String[] args) {
        String[] usuariosDePrueba = {"ana123", "b2", "Carlos_Perez", "9noEmpiezaConLetra"};

        for (String usuario : usuariosDePrueba) {
            System.out.println(usuario + " -> " + (esFormatoValido(usuario) ? "valido" : "invalido"));
        }
    }

    // Reglas implementadas: longitud dentro de rango, y el primer caracter es una letra.
    //
    // Sugerencia / pendiente: el enunciado de la placa (P###LLL) pide reglas por posicion
    // (unos caracteres deben ser digitos, otros letras mayusculas). Esa idea se construye
    // igual que aqui: comparando placa.charAt(i) con Character.isDigit / Character.isUpperCase
    // dentro de un ciclo que recorra el rango de posiciones correspondiente.
    static boolean esFormatoValido(String usuario) {
        if (usuario.length() < LONGITUD_MINIMA || usuario.length() > LONGITUD_MAXIMA) {
            return false;
        }
        if (!Character.isLetter(usuario.charAt(0))) {
            return false;
        }
        return true;
    }
}

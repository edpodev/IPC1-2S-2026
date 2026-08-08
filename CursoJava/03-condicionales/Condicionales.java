public class Condicionales {
    public static void main(String[] args) {
        int nota = 78;
        boolean siGano;
        if (nota <61){
            siGano = false; 
        }else{
            siGano = true;
        }





        // if / else if / else
        if (nota < 61){
            // Perdio
        }else{
            // Gano
        }


        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        // Operador ternario: condicion ? valorSiTrue : valorSiFalse
        String estado = (nota >= 70) ? "Aprobado" : "Reprobado";
        System.out.println("Estado: " + estado);

        // switch clásico (con fall-through si se olvida el 'break')
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }

        // switch expression (Java 14+), más seguro: no necesita 'break'
        String tipoDia = switch (diaSemana) {
            case 1, 2, 3, 4, 5 -> "Día laboral";
            case 6, 7 -> "Fin de semana";
            default -> "Día inválido";
        };
        System.out.println("Tipo de día: " + tipoDia);
    }
}

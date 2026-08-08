# Estructuras condicionales

Todo lo que vemos acá se resume en una idea: el programa llega a un punto, hace una pregunta que solo puede responderse `true` o `false`, y según eso toma un camino u otro. Una sola vez, no se repite — esa es justo la diferencia con los ciclos del siguiente tema, y por eso vale la pena mirar `../assets/condicional-vs-ciclo.svg` cuando lleguemos allá: la única diferencia visual entre ambos diagramas es una flecha que se devuelve.

Las formas que vamos a usar:

- `if` / `else if` / `else` — la de siempre.
- Operador ternario (`condición ? siTrue : siFalse`) — útil cuando la decisión es corta y cabe en una línea, pero no lo encadenen tres veces seguidas porque se vuelve ilegible.
- `switch` clásico, con `case` y `break`.
- `switch` expression (desde Java 14), que evita el error más típico del `switch` clásico.

Sobre ese error típico: si se olvida el `break` en un `switch` de toda la vida, la ejecución sigue cayendo al siguiente `case` aunque no coincida (se llama *fall-through*, y a veces es intencional, pero casi siempre es un bug). La versión moderna con `->` no tiene ese problema — cada `case` termina ahí mismo, no necesita `break`, y por eso la prefiero cuando el proyecto lo permite:

```java
String tipoDia = switch (diaSemana) {
    case 1, 2, 3, 4, 5 -> "Día laboral";
    case 6, 7 -> "Fin de semana";
    default -> "Día inválido";
};
```

Otro tropiezo clásico, este viniendo de gente con experiencia en otros lenguajes: en Java `if (x = 5)` ni siquiera compila si `x` no es `boolean`, así que el típico bug de "puse un solo `=` en vez de `==`" el compilador lo agarra antes de correr nada. Es de las pocas veces que se agradece que Java sea tan estricto.

Ejemplo completo en [`Condicionales.java`](Condicionales.java).

# Tipos de datos

Lo primero que choca cuando alguien viene de Python o JavaScript: en Java una variable no puede cambiar de tipo a medio programa. Si declaraste `int edad`, ahí se queda como `int` para siempre. Al principio se siente como una camisa de fuerza, pero es justo lo que hace que el compilador avise de errores tontos antes de que el programa corra — no después, en producción, con el cliente mirando.

Los tipos primitivos son ocho, y guardan el valor directo en memoria (en `../assets/stack-heap-valor-referencia.svg` se ve exactamente dónde). Se dividen en:

- **Enteros**: `byte`, `short`, `int`, `long`. La diferencia entre ellos es solo cuánto espacio reservan — `../assets/tipos-primitivos-tamanos.svg` lo muestra a escala. En la mayoría de los casos se usa `int`; `long` aparece cuando el número se pasa de los ~2100 millones (por ejemplo, contando milisegundos desde 1970).
- **Decimales**: `float` y `double`. Usen `double` casi siempre, es el que Java asume por defecto. `float` casi no se usa salvo que la memoria sea realmente el problema.
- **`char`**: un solo carácter, entre comillas simples — `'D'`, no `"D"` (eso ya sería un `String`).
- **`boolean`**: `true` o `false`, nada más. A diferencia de JavaScript, acá no existe el truco de que `0` o `""` se comporten como falsos: un `boolean` es un `boolean`, punto.

Y después está `String`, que aunque se usa todo el tiempo como si fuera "otro primitivo más", en realidad es una clase. Eso importa porque `String` (igual que los arreglos) vive en el heap y se maneja por referencia, mientras que un `int` vive directo en el stack. Es la misma historia que se ve en el diagrama de stack/heap, y va a volver a aparecer cuando lleguemos a arreglos.

Dos cosas con las que casi todo el mundo tropieza la primera vez:

```java
double pi = 3.14159;
int piEntero = (int) pi; // 3 — trunca, NO redondea
```

Convertir de `double` a `int` no redondea, corta. Si de verdad quieren redondear, `Math.round(pi)`.

Y esta otra, más traicionera:

```java
double a = 0.1 + 0.2;
System.out.println(a == 0.3); // false
```

No es un bug de Java, es cómo funciona la aritmética de punto flotante en cualquier lenguaje. Vale la pena mencionarlo aunque todavía no hayamos visto condicionales, porque en algún momento alguien va a comparar dos `double` con `==` y se va a volver loco buscando el error.

El ejemplo completo, con salida por consola incluida, está en [`TiposDatos.java`](TiposDatos.java). Se corre con `java TiposDatos.java`.

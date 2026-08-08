# Funciones

Una función es un pedazo de código con nombre que hace un trabajo y **devuelve un resultado** con `return`. La idea es no repetir la misma lógica en diez lugares del programa: se escribe una vez, se llama las veces que haga falta.

```java
static int sumar(int a, int b) {
    return a + b;
}
```

El tipo que va antes del nombre (`int`, en este caso) es el tipo del valor que va a devolver. Si el método dice que devuelve `int` y en algún camino no hay un `return`, el compilador lo marca como error — no deja "olvidarse" de devolver algo.

Java permite tener varios métodos con el mismo nombre, siempre que la lista de parámetros sea distinta (cambia la cantidad, o el tipo). A eso se le llama **sobrecarga**:

```java
static int sumar(int a, int b) { return a + b; }
static int sumar(int a, int b, int c) { return a + b + c; }
```

Y por último, la recursión: una función que se llama a sí misma. El ejemplo de siempre es el factorial. Lo importante acá no es la sintaxis, es que SIEMPRE tiene que haber un caso base que corte la cadena — si no, el programa explota con un `StackOverflowError`, porque cada llamada se apila arriba de la anterior en el stack, y el stack no es infinito.

```java
static int factorial(int n) {
    if (n <= 1) return 1;        // caso base — sin esto, nunca para
    return n * factorial(n - 1);
}
```

Ejemplo completo, con sus salidas, en [`Funciones.java`](Funciones.java).

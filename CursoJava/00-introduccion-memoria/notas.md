# Introducción: cómo Java usa la memoria

Antes de escribir una sola línea de Java vale la pena entender dos palabras que van a aparecer todo el curso: **stack** y **heap**. No es un capricho académico — explican por qué un `int` se comporta distinto a un arreglo, por qué a veces cambiar una variable cambia "otra" que ni tocaste, y por qué existe algo llamado `StackOverflowError`.

## El stack

Cuando el programa llama a un método, Java le reserva un espacio de memoria — un "marco" (frame) — apilado arriba del que ya estaba usando el método que lo llamó. Ahí adentro viven las variables locales y los parámetros de ese método, mientras dure su ejecución. Apenas el método termina (con un `return` o llegando al final del bloque), ese marco se destruye y la memoria se libera sola.

Es una pila literal — de ahí el nombre — y funciona como una pila de platos: el último método que entró es el primero que sale (LIFO). Es rapidísimo, porque no hay que buscar espacio libre, solo apilar y desapilar. La contraparte es que es limitado: si un método llama a otro, que llama a otro, que llama a otro... sin parar (piensen en una recursión sin caso base, como la que mencionamos en `05-funciones/notas.md`), la pila se llena y el programa muere con un `StackOverflowError`.

## El heap

El heap es una región de memoria mucho más grande y menos ordenada, donde viven los objetos: instancias de clases, arreglos, y cosas como `String`. A diferencia del stack, el heap no se limpia solo cuando termina un método — un objeto puede seguir vivo ahí mucho después de que el método que lo creó ya terminó, siempre que alguien todavía tenga una referencia apuntándolo. Cuando ya nadie tiene ninguna referencia hacia un objeto, el **garbage collector** de Java lo detecta y libera esa memoria solo, sin que el programador tenga que pedirlo explícitamente (a diferencia de C, donde uno mismo tiene que hacer `free`).

## Entonces, ¿quién vive dónde?

Acá está la idea que explica el comportamiento que van a ver más adelante, sobre todo en `07-arreglos/notas.md`:

- Los ocho tipos primitivos (`int`, `double`, `boolean`, etc.) guardan su valor directo en el stack. Cuando hacés `int b = a;`, se copia el número. Fin de la historia — son dos copias independientes.
- Todo lo demás — arreglos, `String`, cualquier objeto creado con `new` — vive en el heap. La variable en el stack no guarda el objeto, guarda una **referencia**: algo parecido a una dirección, que apunta a dónde está el objeto real. Cuando hacés `int[] arr2 = arr1;`, lo que se copia es la dirección, no el arreglo. Los dos nombres terminan apuntando al mismo objeto.

El diagrama [`../assets/stack-heap-valor-referencia.svg`](../assets/stack-heap-valor-referencia.svg) dibuja exactamente este escenario con un `int` y un arreglo lado a lado — vale la pena proyectarlo antes de seguir.

Y para que no quede como algo abstracto: corran [`MemoriaDemo.java`](MemoriaDemo.java). Ahí van a imprimir un arreglo con `System.out.println(arr)` sin acceder a ningún índice, y Java va a mostrar algo como `[I@6d06d69c` — ese texto raro es, literalmente, el tipo del objeto más un identificador ligado a su posición en el heap. Si dos variables imprimen exactamente el mismo texto, es la prueba de que apuntan al mismo objeto. Si el texto es distinto, aunque el contenido se vea igual, son dos objetos distintos.

Con esta base, el resto del curso tiene más sentido: por qué copiar un arreglo "no copia" nada, por qué un método puede modificar el arreglo que le pasaste sin necesidad de un `return`, y por qué la recursión sin control revienta la memoria.

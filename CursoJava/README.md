# Curso de Java

Estas son las notas que uso para dar el curso. Están separadas por tema porque en clase avanzamos uno a la vez, y no tiene sentido desplazarse por un archivo de mil líneas buscando dónde quedamos. Cada carpeta trae dos cosas: un `notas.md` con la explicación (para leer y comentar en vivo) y un `.java` completo que se corre tal cual, sin armar ningún proyecto.

## Temas

0. [Introducción a la memoria: stack y heap](00-introduccion-memoria/notas.md)
1. [Tipos de datos](01-tipos-de-datos/notas.md)
2. [Tipos de variables](02-tipos-de-variables/notas.md)
3. [Estructuras condicionales](03-condicionales/notas.md)
4. [Estructuras cíclicas](04-ciclos/notas.md)
5. [Funciones](05-funciones/notas.md)
6. [Procedimientos](06-procedimientos/notas.md)
7. [Arreglos](07-arreglos/notas.md)
8. [Matrices](08-matrices/notas.md)

## Cómo correr el código

Nada de armar un proyecto entero para probar diez líneas. Desde Java 11 se puede ejecutar un `.java` directo, sin compilar aparte:

```bash
java 01-tipos-de-datos/TiposDatos.java
```

Si en medio de la explicación alguien quiere probar algo suelto sin tocar ningún archivo, abrí una terminal y escribí `jshell` — es el REPL de Java, se va tecleando línea por línea y se ve el resultado al instante. Para salir, `/exit`.

Con la extensión de Java para VS Code también aparece un botón "Run" arriba de cada `main`, por si preferís el clic antes que la terminal.

## assets/

Ahí están los diagramas que uso para explicar lo que el código solo no termina de mostrar — sobre todo memoria (stack/heap) y diferencias entre estructuras que a primera vista se parecen demasiado. Cada `notas.md` enlaza al diagrama que le corresponde, pero acá va el resumen:

- `stack-heap-valor-referencia.svg` — por qué copiar un `int` no es lo mismo que copiar un arreglo.
- `tipos-primitivos-tamanos.svg` — cuánto espacio ocupa cada tipo primitivo, a escala.
- `condicional-vs-ciclo.svg` — la diferencia real entre un `if` y un `while`: una flecha que se devuelve.
- `funcion-vs-procedimiento.svg` — por qué a un método `void` no se le puede hacer `int x = miProcedimiento();`.
- `arreglo-vs-matriz.svg` — un índice contra dos índices.

Nada de esto reemplaza la clase, es apoyo visual para el momento en que alguien pregunta "¿pero por qué pasa eso?" y una frase ya no alcanza.

# Estructuras cíclicas

Un ciclo es básicamente un `if` que, en lugar de seguir de largo después de ejecutar el bloque, vuelve a preguntar. Esa flecha que se devuelve es literalmente la única diferencia estructural — está dibujada en `../assets/condicional-vs-ciclo.svg` si quieren mostrarla en pantalla antes de meterse al código.

Las cuatro formas que cubrimos:

- **`for`** — cuando de entrada ya se sabe cuántas vueltas dar (o hay un índice que controlar).
- **`while`** — evalúa la condición ANTES de entrar. Si la condición nace en falso, el bloque nunca se ejecuta ni una vez.
- **`do-while`** — evalúa la condición DESPUÉS. Por eso el bloque se ejecuta sí o sí, al menos una vez, aunque la condición ya venga en falso. Es el que menos se usa, pero aparece cuando hay que pedirle algo al usuario "al menos una vez" (típico: validar un menú).
- **`for-each`** — para cuando se va a recorrer todo un arreglo o colección y no interesa el índice, solo el valor. Más corto, menos propenso a errores de índice.

Y dos palabras clave que controlan el flujo desde adentro:

- `break` corta el ciclo entero, de una.
- `continue` no corta nada, solo se salta el resto de esa vuelta y sigue con la próxima.

El bug más común, y el que más tiempo hace perder cuando recién se empieza: el ciclo infinito, porque a alguien se le olvidó actualizar la variable que controla la condición (`contador++` faltante, por ejemplo). Si el programa se queda "pegado" sin terminar, eso es lo primero que hay que revisar. El segundo más común es el error de "uno de más o uno de menos" (*off-by-one*): usar `<=` cuando tocaba `<`, o al revés, y terminar recorriendo un elemento de más (o de menos) del arreglo.

Todo el recorrido está en [`Ciclos.java`](Ciclos.java), incluido un ejemplo de `break` y `continue` juntos para que se note la diferencia en la misma salida.

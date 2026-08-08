# Tipos de variables

Acá la pregunta no es "qué tipo de dato guarda la variable" sino "dónde vive y cuánto dura". Y eso cambia bastante el comportamiento del programa, sobre todo cuando alguien empieza a mezclar variables de instancia con variables estáticas sin darse cuenta.

- **Variable local**: se declara dentro de un método, y ahí muere en cuanto el método termina. Vive en el stack, junto con los parámetros.
- **Variable de instancia** (o atributo): se declara en la clase, fuera de los métodos, sin `static`. Cada objeto que se crea con `new` tiene su propia copia — si hay dos `Cuenta`, cada una tiene su propio `saldo`.
- **Variable de clase** (estática, con `static`): hay una sola copia, compartida por todos los objetos. Es la que uso para el típico contador de "cuántos objetos he creado" — en el ejemplo, `contadorDeCuentas` se incrementa sin importar cuál instancia lo llame, porque no le pertenece a ninguna en particular.
- **Parámetro**: técnicamente es una variable local más, solo que su valor lo pone quien llama al método.
- **Constante** (`final`): una vez que se le asigna un valor, no se puede volver a asignar. Casi siempre las declaro `static final` cuando son cosas como una tasa de interés o un límite fijo del programa — no tiene sentido que cada objeto cargue su propia copia de un número que nunca cambia.

El error más común que veo en clase es este: alguien declara una variable local con el mismo nombre que un atributo, y después se pregunta por qué el atributo "no cambió". No hay ningún misterio raro pasando — la variable local tapa (hace *shadowing*) al atributo mientras se está dentro de ese bloque. Si de verdad se quiere referir al atributo de la clase y no a la variable local, se usa `this.nombreDeVariable`.

Vean [`TiposVariables.java`](TiposVariables.java): tiene una clase `TiposVariables` sencilla que hace de cuenta bancaria — instancia dos cuentas, le aplica interés a una sola, y muestra cómo el contador estático sí se comparte pero el saldo no.

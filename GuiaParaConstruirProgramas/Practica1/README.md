# Guía por módulos — Práctica 1: Sistema de Estacionamiento

Esta guía acompaña a [`Practica1.pdf`](Practica1.pdf) (Sistema de Estacionamiento, IPC1). **No es la
solución de la práctica.** Es una colección de 9 módulos, cada uno un mini-proyecto Java independiente,
que practica **un solo concepto a la vez** de los que la práctica exige combinar: variables de control,
ciclos, `switch`, arreglos nativos (1D y 2D), `String`/`Character`, `Random`, búsqueda lineal,
condicionales encadenadas y métodos.

Varios ejemplos usan un dominio distinto al de la práctica a propósito (validar un nombre de usuario en
vez de una placa, por ejemplo) y dejan partes sin resolver, marcadas con un comentario de sugerencia. La
idea es entender el patrón y completarlo vos mismo, no copiarlo tal cual — el enunciado es explícito: las
copias totales o parciales de código califican con 0 puntos, y durante la evaluación se te va a pedir
explicar y modificar tu propio código.

## Mapa de la guía

```mermaid
flowchart LR
    subgraph Base
        M00[00 menu]
        M01[01 arreglos 2D]
    end
    subgraph Datos y validacion
        M02[02 cadenas y validaciones]
        M03[03 generacion aleatoria]
        M04[04 busqueda en arreglos]
    end
    subgraph Logica de negocio
        M05[05 validaciones y cobro]
        M06[06 recorrido de matrices]
        M07[07 calculo de rutas]
    end
    M08[08 metodos y modularizacion]

    Base --> Datos y validacion --> Logica de negocio --> M08
    M08 --> Practica[Tu propia Practica 1]
```

## Orden sugerido

| Módulo | Qué practica | Sección relacionada de la rúbrica |
|---|---|---|
| [`00_construyendo_el_menu`](00_construyendo_el_menu/) | Variables de control, `Scanner`, ciclo `do-while`, `switch` | 2.1 Inicialización, entrada/salida y menú |
| [`01_arreglos_bidimensionales_del_tablero`](01_arreglos_bidimensionales_del_tablero/) | Arreglos 2D, recorrido anidado, borde vs. área interna | 2.4 Visualización del estacionamiento |
| [`02_comparacion_de_cadenas_y_validaciones`](02_comparacion_de_cadenas_y_validaciones/) | `String`/`Character`, validación carácter por carácter | 2.2 Ingreso de vehículo, pago y cambio |
| [`03_generacion_aleatoria`](03_generacion_aleatoria/) | `Random`, generar una posición sobre un borde | 2.1 Inicialización, entrada/salida y menú |
| [`04_busqueda_en_arreglos`](04_busqueda_en_arreglos/) | Búsqueda lineal, arreglos paralelos | 2.3 Retiro de vehículo / 2.5 Búsqueda por placa |
| [`05_validaciones_y_cobro`](05_validaciones_y_cobro/) | Validaciones encadenadas, cobro con reintento | 2.2 Ingreso de vehículo, pago y cambio |
| [`06_recorrido_de_matrices`](06_recorrido_de_matrices/) | Recorrido con salida anticipada, verificación de disponibilidad | 2.4 Visualización del estacionamiento |
| [`07_calculo_de_rutas`](07_calculo_de_rutas/) | Modelar el perímetro, aritmética modular, manejo de empates | 2.6 Ruta más corta entre entrada y salida |
| [`08_metodos_y_modularizacion`](08_metodos_y_modularizacion/) | Dividir el programa en métodos, `main` como orquestador | 1.2 Calidad de código |

Cada carpeta tiene su propio `README.md` con la explicación conceptual y su propio proyecto Maven con el
ejemplo ejecutable — no hace falta seguir el orden estrictamente, pero está pensado para que cada módulo
se apoye en el anterior (por ejemplo, el módulo 07 reutiliza el patrón de búsqueda del módulo 04).

## Cómo abrir un módulo en NetBeans

1. `File > Open Project…`.
2. Seleccioná la carpeta del módulo (por ejemplo, `00_construyendo_el_menu`) — NetBeans detecta el
   `pom.xml` automáticamente y lo abre como proyecto Maven.
3. Abrí el archivo `.java` dentro de `src/main/java/...` y presioná `Shift+F6` (Run File) para
   ejecutarlo directamente.
4. Para generar el `.jar` ejecutable de un módulo (igual que va a pedir la entrega final de la práctica),
   corré `mvn package` desde la carpeta del módulo, o usá el botón "Build" de NetBeans (trae Maven
   integrado, así que no hace falta instalarlo aparte).

## Requisitos técnicos que respeta cada ejemplo

Los mismos que exige `Practica1.pdf` en su sección 2.3: solo Java estándar, arreglos nativos (nada de
`ArrayList`, `HashMap`, etc.), `Scanner` para entrada y `Random` para aleatoriedad, código dividido en
métodos, y cada proyecto compila a un `.jar` ejecutable.

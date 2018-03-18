# PR_LAB5_PROGRAMACION2_SOLITARIO
**Autor:** Luis Bravo  
**Curso:** 2017–2018  
**Asignatura:** Programación II — Laboratorio 5 (A.E.D.)

## Descripción
Implementación del método `void play(FIFO<Carta> mazo, LIFO<Carta>[] montones)` en la clase `Solitario`, que simula una versión simplificada del juego **Solitario**.  
El objetivo es mover cartas de una baraja (`mazo`) a los montones correspondientes (`montones`), siguiendo las reglas establecidas en la guía del laboratorio.

### Reglas del juego
1. Extraer una carta del mazo (cola FIFO).
2. Intentar colocarla en el montón correspondiente según palo y valor consecutivo (As, 2, 3... 10).
3. Si no puede colocarse, se mueve al descarte (otra cola FIFO).
4. Repetir hasta vaciar la baraja.
5. Intercambiar mazo y descarte, continuar hasta completar el juego o no poder colocar más cartas.

### Clases incluidas
- **`Carta`**: Representa una carta con palo y valor (`getPalo()`, `getValor()`).
- **`OurFIFOImplementation`**: Implementación de la interfaz FIFO usada para mazos y descartes.
- **`Solitario`**: Contiene la lógica del juego (`play()`).
- **`Tester`**: Verifica la correcta ejecución del método.

### Librerías externas
El proyecto utiliza `aedlibraries.jar`, que debe colocarse en el directorio `libs/` y está referenciado en el `pom.xml` como dependencia local.

### Uso
```bash
# Compilar y ejecutar pruebas
mvn clean compile
mvn test
```

### Notas
- Se utilizan intensivamente las interfaces `FIFO<E>` y `LIFO<E>`.
- Es importante respetar el orden de extracción e inserción de cartas.
- El Tester evalúa el estado final de los montones y el número de operaciones de cola.

— *Luis Bravo*
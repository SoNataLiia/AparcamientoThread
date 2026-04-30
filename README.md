# AparcamientoThread 🚗

## Descripción
Simulación de un aparcamiento con semáforo en Java.

Un aparcamiento tiene **20 plazas** en total.
Al abrir, el vigilante habilita **15 plazas** disponibles.
Se simulan **25 conductores** llegando al aparcamiento.

## Funcionamiento
- Si hay plaza libre → el conductor entra y aparca
- Si no hay plazas → el conductor espera en la entrada
- Al salir → la plaza queda libre para el siguiente

## Tecnologías
- Java
- `java.util.concurrent.Semaphore`
- Multithreading (`extends Thread`)

## Clases
| Clase | Descripción |
|-------|-------------|
| `CentroComercial.java` | Clase principal, lanza los 25 hilos |
| `Conductor.java` | Hilo que representa cada conductor |

## Conceptos clave
- `Semaphore(15, true)` — 15 permisos, modo **fair** (orden de llegada)
- `acquire()` — toma una plaza (espera si no hay)
- `release()` — libera la plaza al salir

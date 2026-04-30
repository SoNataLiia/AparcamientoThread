/*
Un aparcamiento de un centro comercial tiene 20 plazas en total.
Al abrir el centro, el vigilante habilita 15 plazas disponibles.
Cuando un conductor llega al aparcamiento:

Si hay plaza libre, entra y aparca.
Si no hay plazas, espera en la entrada hasta que alguien salga.

Cuando un conductor termina sus compras y sale:

Si hay conductores esperando, el primero de la fila puede entrar.
Si no hay nadie esperando, la plaza queda libre.

Simula 25 conductores llegando al aparcamiento.
 */
package parking;

import java.util.concurrent.Semaphore;

public class Conductor extends Thread{
    private static final Semaphore aparcamiento = new Semaphore(15, true);
    private final int conductores;


    public Conductor(int conductores) {
        this.conductores = conductores;
    }
    @Override
    public void run() {
        try {
            System.out.println("Conductor " + conductores + " esperando plaza");
            aparcamiento.acquire();
            System.out.println("Conductor " + conductores + " aparca. Plazas disponibles: " + aparcamiento);
            Thread.sleep(2000);
            System.out.println("Conductor " + conductores + " sale.");
            aparcamiento.release();
            System.out.println("Plazas disponibles: " + aparcamiento.availablePermits());
        } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
        }
    }
}

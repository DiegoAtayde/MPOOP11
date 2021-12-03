/**
*   Clase que implementa la interfaz Runnable.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
package hilos;

//de la interfaz Runnable
public class HiloR implements Runnable{
/**
*   Ejecuta el hilo.
*/
  public void run(){
    for(int i=0; i<10; i++){
      System.out.println("Iteración "+i+" del "+Thread.currentThread().getName());
    }
    System.out.println("Termina el hilo "+Thread.currentThread().getName());
  }  
}

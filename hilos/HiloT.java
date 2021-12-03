/**
*   Clase que hereda de Thread.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
package hilos;

//de la clase Thread
public class HiloT extends Thread{
/**
*   Constructor que recibe como parametro el nombre del hilo.
*   @param nombre del hilo.
*/
  public HiloT(String nombre){
    super(nombre);
  }
/**
*   Sobreescritura del metodo para ejecutar el hilo.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
  @Override
  public void run() {
    for(int i=0; i<10; i++){
      System.out.println("Iteración "+i+" del "+getName());
    }
    System.out.println("Termina el hilo: "+getName());
  }
}
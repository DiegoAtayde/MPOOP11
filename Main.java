import hilos.HiloR;
import hilos.HiloT;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
        
    // ** De Thread **
    // - lo guardo como variable
    HiloT hilo1 = new HiloT("Primer Hilo"); 
    hilo1.start();
    // - sólo lo uso
    new HiloT("Segundo Hilo").start();

    // ** De Runnable **
    new Thread(new HiloR(), "Tercer Hilo").start();
    new Thread(new HiloR(), "Cuarto HIlo").start();

    // ** Para el Main **
    // - for del main
    for(int i=0; i<10; i++)
      System.out.println("Iteración "+i+" del Main");
    // - mensaje del Main
      System.out.println("Termina el hilo Main");
  }
}

package threads;

public class SincronizandoHilos {

	public static void main(String[] args) {
		
		HilosVarios hilo = new HilosVarios();
		
		//hilo.start();
		
		/*try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		HilosVarios2 hilo2 = new HilosVarios2(hilo);
		
		hilo2.start();
		
		hilo.start();
		
		/*try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Terminado");

	}

}

class HilosVarios extends Thread{
	
	public void run(){
		
		for(int i = 0; i < 15; i++){
			
			System.out.println("Ejecutando hilo " + Thread.currentThread().getName() );
			
			try {
				Thread.sleep(70);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}

class HilosVarios2 extends Thread{
	
	private Thread hilo;
	
	public HilosVarios2(Thread hilo){
		
		this.hilo = hilo;
	}
	
	public void run(){
		
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i = 0; i < 15; i++){
			
			System.out.println("Ejecutando hilo " + Thread.currentThread().getName() );
			
			try {
				Thread.sleep(70);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
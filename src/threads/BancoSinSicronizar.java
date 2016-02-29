package threads;

public class BancoSinSicronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Banco{
	
	private final double[] cuentas;
	
	public Banco(){
		
		cuentas = new double[100];
		
		for(int i = 0; i < cuentas.length; i++){
			
			cuentas[i] = 2000;
			
		}
		
	}
	
	public void Transferencia(int cuenta_origen, int cuenta_destino, double cantidad){
		
		if(cuentas[cuenta_origen] < cantidad){ //evalua que el saldo no es inferior a transferencia
			
			return;
			
		}
		
		System.out.println(Thread.currentThread().getName());
		
		cuentas[cuenta_origen] -= cantidad; //dinero que sale de cuenta origen
		
		System.out.printf("%10.2f de %d para %d", cantidad, cuenta_origen, cuenta_destino);
		
		cuenta_destino += cantidad; //dienro que entra a cuenta destino
		
		System.out.printf(" Saldo total: %10.2f %n", getSaldoTotal());
		
	}
	
	public double getSaldoTotal(){
		
		double suma_cuentas = 0;
		
		for(double a : cuentas){
			
			suma_cuentas += a;
			
		}
		
		return suma_cuentas;
		
	}
	
}
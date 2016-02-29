package clasesgenericas;

public class Pareja <T>{

	private T primero;
	
	public Pareja(){
		
		primero = null;
		
	}

	public void setPrimero(T nuevo_valor) {
		
		primero = nuevo_valor;
		
	}
	
	public T getPrimero(){
		
		return primero;
		
	}
	
	public static void imprimirEmpleado(Pareja<? extends Employee> p ){ //tipo comodin asi puede admitir cualquier tipo de objecto incluso de sus subclases
		
		Employee primero = p.getPrimero();
		
		System.out.println(primero);
		
	}
	
}

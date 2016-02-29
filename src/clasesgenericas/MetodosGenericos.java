package clasesgenericas;

public class MetodosGenericos {

	public static void main(String[] args) {
		
		String nombre[] = {"Jose", "Maria", "Carlos", "Luis"};
		
		String elemetos = MisMatices.getElementos(nombre);
		
		System.out.println(elemetos);
		
		System.out.println(MisMatices.getMenor(nombre));

		Employee lista[] = {new Employee("Luis", 45, 2500), new Employee("Juan", 16, 1200),
				new Employee("Alicia", 23, 2455)};
		
		System.out.println(MisMatices.getElementos(lista));
		
		//System.out.println(MisMatices.getMenor(lista)); //Error la clase Employee no implementa la intrfaz CompareTo
		
	}

}

class MisMatices{
	
	public static <T> String getElementos(T[]a){
		
		return "El array tiene: " + a.length + " elementos"; 
		
	}
	
	public static <T extends Comparable> T getMenor(T[]a){ //se implemeta la Interfaz Comparable para usar compareTo
		
		if(a == null || a.length == 0){
			
			return null;
		}

		T elemento_menor = a[0];
		
		for(int i = 1; i < a.length; i ++){
			
			if(elemento_menor.compareTo(a[i]) > 0){
				
				elemento_menor = a[i];
				
			}
			
		}
		
		return elemento_menor;
		
	}
	
}

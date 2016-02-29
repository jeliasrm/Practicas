package clasesgenericas;

public class HerenciaGenerica {

	public static void main(String[] args) {
		
		/*Employee admin = new Employee("Elena", 25, 1200);
		
		Manager director = new Manager("Ana", 23, 3200);
		
		Employee nuevo = director;*/
		
		Pareja<Employee> aministrativo = new Pareja<Employee>();
		
		Pareja<Manager> director = new Pareja<Manager>();
		
		//Pareja<Employee> nuevo = director;
		
		Pareja.imprimirEmpleado(aministrativo);
		
		Pareja.imprimirEmpleado(director);
		
	}

}

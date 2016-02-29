package clasesgenericas;

public class Employee{

	private String name;
	
	private int edad;
	
	private double salary;
	
	public Employee(String name, int edad, double salary) {
		
		this.name = name;
		
		this.edad = edad;
		
		this.salary = salary;		
		
	}
	/*public String toString(){
		
		return "Name: " + name + " Edad: " + edad + " Salary: " + salary;
		
	}*/
	
	
	public String dame(){
		
		return "Name: " + name + " Edad: " + edad + " Salary: " + salary;
		
	}
	
}

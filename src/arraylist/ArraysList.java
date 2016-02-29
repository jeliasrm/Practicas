package arraylist;

import java.util.ArrayList;
import java.util.*;


public class ArraysList {

	public static void main(String[] args) {
		
		/*Employee[] person = new Employee[3];
		 
		 person[0] = new Employee("Bob", 20, 2000);
		 
		 person[1] = new Employee("Aly", 20, 2000);
		 
		 person[2] = new Employee("Ely", 25, 2000);*/
		
		ArrayList<Employee> person = new ArrayList<Employee>();
		
		person.ensureCapacity(11); //para consumir menos recursos ya que limite por defalt es de 10
		
		person.add(new Employee("Bob", 20, 2000));
		
		person.add(new Employee("Aly", 20, 2000));
		
		person.add(new Employee("Ely", 25, 2000));
		
		person.add(1, new Employee("Elyas", 25, 2000));
		
		//person.add("Paco");
		
		person.trimToSize(); //cierra el array nos ayuda a optimizar el espacio de memoria con el recolector
		
		System.out.println(person);
		
		System.out.println(person.size());
		
		Iterator <Employee> myInterator = person.iterator();
		
		while(myInterator.hasNext()){
			
			System.out.println(myInterator.next().dame());
			
		}
		
		
		/*for(int i = 0; i < person.size(); i++){
			
			Employee e = person.get(i);
			
			System.out.println(e.dame());
			
		}*/
		 
		 /*for(Employee e :person){
			 
			 System.out.println(e);
			 
		 }*/

	}

}

class Employee{

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
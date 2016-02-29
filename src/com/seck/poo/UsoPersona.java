package com.seck.poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		
		Person[] person = new Person[2];
		
		person[0] = new Employee2("Fito", 50000, 2010, 01, 24);
		person[1] = new Student("Juan", "Info");
		
		for(Person p : person) {
			
			System.out.println("Name: " + p.getName() + " " + p.getDescripcion());
			
		}

	}

}

abstract class Person {
	
	private String name;
	
	private String descripcion;
	

	public Person(String name){
		
		this.name = name;
		
	}
	
	
	
	//GETTERS & SETTERS
	
	public String getName() {
		
		return name; //+ " Id: " + Id;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}

	public abstract String getDescripcion();
	

	public void setDescripcion(String descripcion) {
		
		this.descripcion = descripcion;
		
	}
	
	
	
}



class Employee2 extends Person{
	
	private String name;
	
	private double salary;
	
	private Date hire;
	
	private int Id;
	
	private static int Idnext = 1;
	
	
	public Employee2(String name, double salary, int year, int month, int day) {
		
		super(name);
		
		this.salary = salary;
		
		GregorianCalendar calendar = new GregorianCalendar (year, month-1, day);
		
		hire = calendar.getTime();
		
		Id = Idnext;
		
		Idnext ++;
		
	}
	
	/*public Employee2(String name){
		
		this(name, 30000, 2000, 01, 01);
		
	}*/

	
	public void salaryIncrease(double percentage){
		
		double increase = salary * percentage /100;
		
		salary += increase;
		
	}
	
	@Override
	public String getDescripcion() {
		
		return "Employee with ID: " + Id + " salary: " + salary;
	}
	
	
	//GETTERS & SETTERS
	

	public double getSalary() {
		
		return salary;
		
	}
	
	public void setSalary(double salary) {
		
		this.salary = salary;
		
	}

	public Date getHire() {
		
		return hire;
		
	}

	public void setHire(Date hire) {
		
		this.hire = hire;
		
	}
	
}

class Student extends Person {
	
	private String major;
	
	public Student(String name, String major) {
		
		super(name);
		
		this.major = major;
		
	}

	@Override
	public String getDescripcion() {
		
		return "Study Major: " + major;
	}
	
}


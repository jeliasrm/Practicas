package com.seck.ficheros;

import java.io.*;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializacion {

	public static void main(String[] args) {
		
		 Manager boss = new Manager("Juan", 22, 2000, 12, 15);
		 
		 boss.setIncentive(5000);
		 
		 Employee[] person = new Employee[3];
		 
		 person[0] = boss;
		 
		 person[1] = new Employee("Aly", 20, 2000, 12, 12);
		 
		 person[2] = new Employee("Ely", 25, 2000, 12, 10);
		 
		 try {
			 
			/*ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream("C:/Users/Jelias/workspace/Practicas/tests.txt"));
			
			writeFile.writeObject(person);
			
			writeFile.flush();
			
			writeFile.close();*/
			
			ObjectInputStream readFile = new ObjectInputStream(new FileInputStream("C:/Users/Jelias/workspace/Practicas/tests.txt"));
			
			Employee[] readPerson = (Employee[]) readFile.readObject();
			
			readFile.close();
			
			for(Employee e : readPerson)
				
				System.out.println(e);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String names;
	
	private double salary;
	
	private Date hire;	
	
	public Employee(String name, double salary, int year, int month, int day) {
		
		this.names = name;
		
		this.salary = salary;
		
		GregorianCalendar calendar = new GregorianCalendar (year, month-1, day);
		
		hire = calendar.getTime();
		
	}
	
	public Employee(String name){
		
		this.names = name;
		
	}

	
	public void salaryIncrease(double percentage){
		
		double increase = salary * percentage /100;
		
		salary += increase;
		
	}
	
	public String toString(){
		
		return "Name: " + names + ", Salary: " + salary + ", Hired: " + hire ;
		
	}
	
	
	//GETTERS & SETTERS
	
	public String getName() {
		
		return names;
		
	}

	public void setName(String name) {
		
		this.names = name;
		
	}

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

	
class Manager extends Employee{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double incentive;
	
	public Manager(String name, double salary, int year, int month, int day){
		
		super( name, salary, year, month, day );	
		
		incentive = 0;
		
	}
	
	//GETTERS & SETTERS
	
	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		
		this.incentive = incentive;
	}
	
	public double getSalary() {
		
		double salary = super.getSalary();
		
		return salary + incentive ;
		
	}
	
	public String toString(){
		
		return super.toString() + " Incentivo " + incentive;
		
	}

	
	
}
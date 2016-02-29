package com.seck.poo;

import java.util.Arrays;
import java.util.Date;

import java.util.GregorianCalendar;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		//Employee employee1 = new Employee ("John ", 85000, 1995, 12, 17);
		//employee1.salaryIncrease(5);
		//System.out.println("Name: " + employee1.getName() + " Salary: " + employee1.getSalary() + " Hire: " + employee1.getHire());
		
		Manager hrBoss = new Manager("Bob ", 1000, 1996, 10, 05);
		
		hrBoss.setIncentive(11);
		
		Employee[] myEmployees = new Employee[6];
		
		myEmployees[0] = new Employee ("Jess", 150, 1995, 12, 17);
		
		myEmployees[1] = new Employee ("Baby", 120, 1995, 12, 17);
		
		myEmployees[2] = new Employee ("Cell", 180, 1995, 12, 17);
		
		myEmployees[3] = new Employee ("July", 100, 1995, 12, 17);
		
		myEmployees[4] = hrBoss; //Polimorfismo. Principio de sustitución
		
		myEmployees[5] = new Manager("Alex", 100, 1996, 05, 02);
		
		Manager financesBoss = (Manager) myEmployees[5]; //Casting
		
		financesBoss.setIncentive(0);
		
		//financesBoss.bonus(0);
		
		System.out.println(financesBoss.getName() + " " + financesBoss.bonus(0));
		
		System.out.println(hrBoss.takeDecisions("Today everybody will work extra time"));
		
		
		/*Employee directorComercial = new Manager("Gues",  70000, 2005, 14, 05);
		
		Comparable example = new Employee ("Elly", 95000, 2001, 01, 11);
		
		myEmployees[6] = directorComercial;
		
		myEmployees[7] = (Employee) example;
		
		if(directorComercial instanceof Employee)
			
			System.out.println("Type Manager");
		
		if(example instanceof Comparable)
			
			System.out.println("Instance of Comparable");*/
		
		
		for ( Employee e: myEmployees ){
			
			e.salaryIncrease(0);
			
		}
		
		Arrays.sort(myEmployees);
		
		for ( Employee e: myEmployees ){
			
			System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary()
				+ " Bonus: " + e.bonus(1) +" Total Salary: " + (e.getSalary()+e.bonus(1))
				+ " Hire: " + e.getHire());
			
		}
		

	}

}



class Employee implements Comparable, Worker{
	
	private String name;
	
	private double salary;
	
	private Date hire;
	
	private int Id;
	
	private static int Idnext = 1;
	
	
	public Employee(String name, double salary, int year, int month, int day) {
		
		this.name = name;
		
		this.salary = salary;
		
		GregorianCalendar calendar = new GregorianCalendar (year, month-1, day);
		
		hire = calendar.getTime();
		
		Id = Idnext;
		
		Idnext ++;
		
	}
	
	public Employee(String name){
		
		this.name = name;
		
	}

	
	public void salaryIncrease(double percentage){
		
		double increase = salary * percentage /100;
		
		salary += increase;
		
	}
	
	
	@Override
	public int compareTo(Object o) {
		
		Employee anotherEmployee = (Employee) o;
		
		if(this.salary < anotherEmployee.salary)
			
			return -1;
		
		if(this.salary > anotherEmployee.salary)
		
			return 1;
			
		return 0;
		
	}
	
	
	@Override
	public double bonus(double gratification) {
		
		return Worker.baseBonus + gratification;
	}
	
	
	
	//GETTERS & SETTERS
	
	public String getName() {
		
		return name + " Id: " + Id;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
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

	
class Manager extends Employee implements Managers {
	
	private double incentive;
	
	public Manager(String name, double salary, int year, int month, int day){
		
		super( name, salary, year, month, day );	
		
	}
	
	@Override
	public String takeDecisions(String decision) {
		
		return "Take decision: " + decision;
	}
	
	@Override
	public double bonus(double gratification) {
		
		double prima = 20;
		
		return Worker.baseBonus + gratification + prima;
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

	
	
}

final class Director extends Manager{   //final cannot extended
	
	public Director(String name, double salary, int year, int month, int day){
		
		super( name, salary, year, month, day );
		
	}
	
	
}
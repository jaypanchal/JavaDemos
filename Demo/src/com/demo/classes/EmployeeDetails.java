package com.demo.classes;

class Person{
	int id;
	String name;
	
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person{
	
	float salary;
	
	Employee(int id, String name, float salary) {
		// TODO Auto-generated constructor stub
		super(id, name);
		this.salary = salary;
		
	}
	
	void Display(){
		System.out.println(id  + ", " + name + ", " + salary);
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(1, "Jay", 10f);
		
		employee.Display();
		
	}

}

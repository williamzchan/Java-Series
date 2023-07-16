
public class Employee {
	//attributes
	String name;
	int age;
	int salary;
	Locations location;
	
	void raiseSalary(int x) {
		this.salary = this.salary + x;
	}
	
	Employee(int age, String name, int salary, Locations location){
		
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.location = location;
		
	}

	
}

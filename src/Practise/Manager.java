package Practise;

public class Manager extends Employee{
	double salary;
	
	public Manager(double salary) {
		this.salary=salary;
		
	}

	@Override
	public void printSalary() {
		double deduction=salary*10/100;
		double updatedSalary=salary-deduction;
		System.out.println("Updated Salary: "+updatedSalary);
		
		
	}

}

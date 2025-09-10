package Practise;

public class HR extends Employee {
double salary;
	
	public HR(double salary) {
		this.salary=salary;
		
	}

	@Override
	public void printSalary() {
		double deduction=salary*20/100;
		double updatedSalary=salary-deduction;
		System.out.println("Updated Salary: "+updatedSalary);
		
	}

}

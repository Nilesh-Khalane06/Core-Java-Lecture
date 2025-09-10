package Practise;

public class Developer extends Employee{
double salary;
	
	public Developer(double salary) {
		this.salary=salary;
		
	}

	@Override
	public void printSalary() {
		double deduction=salary*15/100;
		double updatedSalary=salary-deduction;
		System.out.println("Updated Salary: "+updatedSalary);
		
		
	}

}

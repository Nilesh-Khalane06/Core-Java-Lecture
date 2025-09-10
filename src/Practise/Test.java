package Practise;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Employee employee;
		
		System.out.println("Enter your Choice: ");
		System.out.println("1. Manager");
		System.out.println("2. HR");
		System.out.println("3. Developer");
		
		int choice=scanner.nextInt();
		
		
		switch (choice){
		case 1: {
			System.out.println("Enter Manager Salary: ");
			double mSalary=scanner.nextDouble();
			employee=new Manager(mSalary);
			employee.printSalary();
			break;
		}
		case 2:{
			System.out.println("Enter HR Salary: ");
			double mSalary=scanner.nextDouble();
			employee=new HR(mSalary);
			employee.printSalary();
			break;
			
		}
		case 3:{
			System.out.println("Enter Developer Salary: ");
			double mSalary=scanner.nextDouble();
			employee=new Developer(mSalary);
			employee.printSalary();
			break;
			
		}
		default:
			System.out.println("Invalid Choice:");
		}
		
		
	}

}

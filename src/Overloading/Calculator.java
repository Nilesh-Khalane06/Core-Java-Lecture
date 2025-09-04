package Overloading;
//overloading ->Compile time polymorphism

public class Calculator {
	//example1
	public void addition(int a,int b) {
		int sum=a+b;
		System.out.println("Sum Of Two Numbers : " +sum);
		
	}
	public void addition(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Sum Of Three Numbers : " +sum);
		
	}
	//example2
	
	public void printSomething(String name,int id) {
		
	}
	public void printSomething(int id,String name) {
		
	}

}

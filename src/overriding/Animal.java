package overriding;

public class Animal {
	//constructor not overriding
	
	public Animal() {
		
	}
	int a=9;
	
	public void printName() {
		System.out.println("Print name-Animal");
		
	}
	public void printColorName() {
		System.out.println("Red,black");
		
	}
	public void printsomething() {
		System.out.println("something method");
		System.out.println(this.a);
		this.printColorName();
		this.printName();
		
	}

}

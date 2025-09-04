package overriding;

public class Lion extends Animal {
	
	public Lion() {
		this(25);
		System.out.println("Default Constructor");
		
		
	}
	public Lion(int a) {
		System.out.println("a is constructor in: "+a);
		
	}


	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("print name-Lion");
	}
	
	public void printSomething() {
		
	}

}

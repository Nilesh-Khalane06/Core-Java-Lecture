package Static;

public class Animal {
	static int rno=5;
	static {
		System.out.println("Nilesh sanjya khalane");
	}
	static int age=21;
	
	public  static void printname() {
		System.out.println("Tiger");
		
	}
	public Animal() {
		System.out.println("Constructor");
	}
	static {
		System.out.println("At post khandlay bk");
	}
	
	

}

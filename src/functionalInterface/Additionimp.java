package functionalInterface;

public class Additionimp {
	
	public static void main(String[] args) {
		FiAddition f=( a,  b) -> {
			
			System.out.println(a+b);
			
			
		};
		f.addition(25, 25);
	}
	
	
	
	
	
	

//	@Override
//	public void addition(int a, int b) {
//		System.out.println(a+b);
//		
//		
//	}

}

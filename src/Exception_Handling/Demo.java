package Exception_Handling;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println("Nilesh");
	
		try {
			
			int div=12/0;		
			System.out.println(div);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("My Name");
		}
		System.out.println("Khalane");
		
		
	}

}

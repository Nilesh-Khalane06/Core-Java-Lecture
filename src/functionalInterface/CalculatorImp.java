package functionalInterface;

public class CalculatorImp {
	public static void main(String[] args) {
		
		FICalculator cal=( a, b) ->{
			System.out.println("Addition is: "+(a+b));
			System.out.println("Subtrasction is: "+(a-b));
			System.out.println("Mul is: "+(a*b));
			System.out.println("Division is: "+(a/b));
			
			
		};
		cal.operation(80, 10);
		
	}

}

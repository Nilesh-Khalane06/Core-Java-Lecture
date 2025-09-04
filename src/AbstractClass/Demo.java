package AbstractClass;

public class Demo {
	public static void main(String[] args) {
		
		String value="HR";
		
		Employee e;
		
		if(value.equalsIgnoreCase("manager")) {
			e=new Manager();
			e.printSalary();
		}else {
			e=new HR();
			e.printSalary();
		}
	}

}

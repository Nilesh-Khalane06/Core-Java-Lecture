package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo4 {
	public static void main(String[] args) {
		
		Demo4 d=new Demo4();
		
		
		try {
			d.printSomething();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public void printAnithing() throws FileNotFoundException {
		Demo4 d=new Demo4();
		d.printSomething();
		
		
	}
	
	public void printSomething() throws FileNotFoundException {
		FileReader reader=new FileReader("abc.txt");
		
	}

}

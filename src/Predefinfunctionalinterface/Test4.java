package Predefinfunctionalinterface;

import java.util.function.Supplier;

public class Test4 {
	public static void main(String[] args) {
		//supplier only return the value
		Supplier<String> aa=()->"Nilesh";
		System.out.println(aa.get());
		
		//Supplier<Integer> ab=()->{25};
	}

}

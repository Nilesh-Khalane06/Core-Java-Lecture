package Predefinfunctionalinterface;

import java.util.function.BiPredicate;

public class Test6 {
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> b=(x,y)->{
			 int a=(x+y)/2;
			 return a%2==0;
			
		};
		boolean val=b.test(14, 14);
		System.out.println(val);
	}

}

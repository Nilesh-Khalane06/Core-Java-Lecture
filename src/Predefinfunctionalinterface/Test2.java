package Predefinfunctionalinterface;

import java.util.function.Function;

public class Test2 {
	public static void main(String[] args) {
		//square
		Function<Integer, Integer> square=x -> x*x;
		Integer a=square.apply(11);
		System.out.println(a);
		
		
		//count number of the alphabet of the string
		
		Function<String, Integer> count=y -> y.length();
		Integer b=count.apply("Nilesh");
		System.out.println(b);
		
		Function<Integer, Integer> addTwo=x-> x+2;
		Function<Integer, Integer> addthree=x->x+3;
		
		System.out.println(addTwo.andThen(addthree).apply(10));//10+2 -> 12+3 -> 15
		
		
		
	}

}

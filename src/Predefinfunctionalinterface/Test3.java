package Predefinfunctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
	public static void main(String[] args) {
		
		Consumer<String> c=x->System.out.println(x);
		c.accept("Khalane");
		
		//find the length of the string
		Consumer<String> ca=x->System.out.println(x.length());
		ca.accept("Nilesh");
		
		//list exmple
//		List<Integer> list=Arrays.asList(23,55,6,669,65,35,25,365,45);
//		
//		Consumer<List<Integer>> cb=(x)->{
//			for (int a : x) {
//				System.out.print(a+" ");
//				
//			}
//			
//		};
//		cb.accept(list);
		
		
		Supplier<String> aa=()->{
			return "Nilesh";
			
			
			
		};
		System.out.println(aa.get());
	}

}

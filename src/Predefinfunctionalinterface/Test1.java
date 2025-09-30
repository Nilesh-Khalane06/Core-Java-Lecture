
package Predefinfunctionalinterface;

import java.util.function.Predicate;

public class Test1 {
	public static void main(String[] args) {
		//check num is even or not
		Predicate<Integer> p = x-> x %2==0;
		boolean b=p.test(24);
		System.out.println(b);
		
		//start with
		Predicate<String> pb=y->y.toLowerCase().startsWith("a"); //also we use the lowercase
		System.out.println(pb.test("Ajay"));
		
		//end with
		
		Predicate<String> pc=z->z.endsWith("h");
		System.out.println(pc.test("Nilesh"));
		
		
		//check greter than or not 
		Predicate<Integer> i=x->x>50;
		System.out.println(i.test(25));
		
		
	}

}

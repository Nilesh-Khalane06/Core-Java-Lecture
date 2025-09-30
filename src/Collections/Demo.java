package Collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		//with generic[with diamond braces]
		List<String> list=new ArrayList<String>();
		
		list.add("Chetan");
		list.add("Pratiksha");
		
		System.out.println(list.toString());
		for (String string : list) {
			System.out.println(string.toLowerCase());
			
			
			//without generics
			
			
		}
		List la=new ArrayList();
		la.add("a");
		la.add(1234);
		la.add(false);
		
		System.out.println(la.toString());
		
		
	}

}

package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingElements {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
      
		l.add(101);
		
		List<Integer> la=new ArrayList<>(200);
		la.add(201);
		la.add(55);
		
		
		
		
		
		List<Integer> lb=Arrays.asList(1,2,3);
		
		
		////adding one element in the array using arraylist
		///
	Integer[] arr={1,2,3,5,6};
	List<Integer> lc=Arrays.asList(arr);
	//lc.add(78);
	
	System.out.println(lc.toString());
	}

}

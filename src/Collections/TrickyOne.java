package Collections;

import java.util.ArrayList;
import java.util.List;

public class TrickyOne {
	public static void main(String[] args) {
		
		
		
	
	//1. numbers 1 - 20 -> Done
	//2. filter even number -> Done
	//3. store even number in list -> Done
	//4. print list

		List<Integer> evenNoList=new ArrayList<Integer>();
		
		for(int i=1; i<= 20;i++) {
			if(i%2==0) {
				evenNoList.add(i);
			}
			
		}
		for (Integer integer : evenNoList) {
			System.out.println(integer);
			
		}
		
		
}
}

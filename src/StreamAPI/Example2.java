package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6);
		
		//find the num divisible by 3
		l.stream()
		.filter(x->x%3==0)
		.forEach(x->System.out.println(x));
		
		//multiply by 10 and strore into the list
		List<Integer> la=l.stream()
		.map(value->value*10)
		.collect(Collectors.toList());
		System.out.println(la.toString());
		
		
		//count less than 5
		
		Long a=l.stream()
		.filter(x->x<5)
		.count();
		
		System.out.println("count is : "+a);
	}

}

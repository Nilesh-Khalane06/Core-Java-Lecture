package array;

public class Demo2 {
	public static void main(String[] args) {
//		//hetero array
//		Object[] heteroArray= {12,"Nilesh",54.30,true};
//		System.out.println(heteroArray[2]);
//		
		
		int[]rollNo= {11,12,13,14};
		//System.out.println(rollNo.length);
		
		
//		for(int a=0;a<rollNo.length;a++) {
//			//System.out.println(a);
//			System.out.println(rollNo[a]);
		
//		for(int i = rollNo.length-1;i>=0;i--) {
//			//System.out.println(i);
//			System.out.println(rollNo[i]);
//		}
//		
		
		//find the odd numbers from the roll NO
		System.out.println("=====odd numbers from the rollNo array====");
		for(int b=0;b<rollNo.length;b++) {
			if(rollNo[b]%2!=0) {
				System.out.println(rollNo[b]);
				
			}
		}
			
		}
		
	}



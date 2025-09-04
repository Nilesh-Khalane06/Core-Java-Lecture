package StringwithForLoop;

public class Even {
	public static void main(String[] args) {
		String day="Monday";
		int length=day.length();
		for(int i=0;i<day.length();i++) {
			if(i%2==0) {
				System.out.println(day.charAt(i));
				
			}
			
		}
	
	}

}

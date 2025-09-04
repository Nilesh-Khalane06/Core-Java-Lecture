package StringwithForLoop;

import java.util.Scanner;

public class usenametask2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first name");
		String name=sc.nextLine();
		
		System.out.println("Enter a last name");
		String lname=sc.nextLine();
		
		System.out.println("Enter a year");
		int year=sc.nextInt();

		String username = "";
		
		username = username + lname.charAt(0);
		username=username+name.substring(0, 4);
		//username = username + name.charAt(0) + name.charAt(1) + name.charAt(2) + name.charAt(3);
		int a =  year % 100;
		
		if(a <= 9) {
			username = username + "0" + year % 100;
		}else {
			username = username + year % 100;
		}
		System.out.println(username);
	}

}

package StringwithForLoop;

import java.util.Scanner;

public class Usernametask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first Name");
		String name = sc.nextLine();
		System.out.println("Enter your last name");
		String lname = sc.nextLine();
		System.out.println("Enter your birth year");
		int year = sc.nextInt();

		for (int i = 0; i < 1; i++) {
			System.out.print(lname.charAt(0));

		}
		for (int a = 0; a < 4; a++) {
			System.out.print(name.charAt(a));

		}
        year = year % 100;
		if (year < 9) {
			System.out.print("0" + year);
		}else {
			System.out.print(year);
		}
	}

}

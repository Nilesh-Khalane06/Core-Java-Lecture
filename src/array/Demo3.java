package array;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Find student using there city : ");
//		String city = sc.nextLine();
//
//		int code = 0;
//
//		if (city.matches("\\d+")) {
//			code = Integer.parseInt(city);
//		}

		Student s = new Student();
		s.setId(101);
		s.setName("Nilesh");
		s.setCity("Dhule");
		s.setAge(21);

		Student s1 = new Student();
		s1.setId(102);
		s1.setName("Chetan");
		s1.setCity("Pune");
		s1.setAge(2);

		Student s2 = new Student();
		s2.setId(101);
		s2.setName("Gopal");
		s2.setCity("Jalgoan");
		s2.setAge(32);

		Student s3 = new Student();
		s3.setId(101);
		s3.setName("Rohit");
		s3.setCity("Dhule");
		s3.setAge(22);

		Student[] studentarray = { s, s1, s2, s3 };

		for (int i = 0; i < studentarray.length; i++) {

//			if (studentarray[a].getCity().equalsIgnoreCase(city) || studentarray[a].getName().equalsIgnoreCase(city)
//					|| studentarray[a].getId() == code) {
//				System.out.println(studentarray[a].getId());
//				System.out.println(studentarray[a].getName());
//				System.out.println(studentarray[a].getCity());
//			}

			if (studentarray[i].getAge() >= 18) {
				System.out.println(studentarray[i].getId());
				System.out.println(studentarray[i].getName());
				System.out.println(studentarray[i].getCity());
				System.out.println(studentarray[i].getAge());
				System.out.println();
			}

		}

	}

}

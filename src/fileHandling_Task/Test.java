package fileHandling_Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Test {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("welcome to student portal: ");
		System.out.println("please enter how many of number you want to add: ");

		int noOfStudent = sc.nextInt();
		int count = 1;

		while (count <= noOfStudent) {
			Test test = new Test();

			// create student from user input

			Student student = test.getStudentObjectFromUser();

			try {
				// add student to file
				String msg = test.updateFile(student);
				System.out.println(msg);

			} catch (IOException e) {
				e.printStackTrace();

			}
			count++;

		}
		System.out.println("Total student added in file : " + (count - 1));
		sc.close();

	}

	private String updateFile(Student student) throws IOException {
		// directory path
		String directoryPath = "C:\\Users\\hp\\Music\\File Handling";

		String fileName = "StudentData.txt";

		File file = new File(directoryPath + "\\" + fileName);

		if (file.createNewFile()) {
			System.out.println("file created withName : ");

		} else {
			System.out.println("File already exists : UPdating existing file");
		}

		FileWriter writer = new FileWriter(file, true);

		writer.write(student.getId() + " : ");
		writer.write(student.getfName() + " : ");
		writer.write(student.getlName() + " : ");

		// Note - phoneNumber casted to BigInt as write do not allow long.
		writer.write(student.getPhoneNumber() + " : ");

		writer.write(student.getCity() + System.lineSeparator());

		String msg = "Student : " + student.getfName() + " : updated in file : " + fileName;

		writer.close();
		return msg;
	}

	private Student getStudentObjectFromUser() {

		System.out.println("Please provide following details ");

		System.out.println("please enter student id: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("please enter first name : ");
		String fname = sc.nextLine();

		System.out.println("please enter last name: ");
		String lname = sc.nextLine();

		System.out.println("please enter phone number: ");
		String phoneNumber = sc.nextLine();

		System.out.println("please enter city: ");
		String city = sc.nextLine();

		Student student = constructStudentObject(id, fname, lname, phoneNumber, city);
		return student;

	}

	private Student constructStudentObject(int id, String fname, String lname, String phoneNumber, String city) {

		Student student = new Student();
		student.setId(id);
		student.setfName(fname);
		student.setlName(lname);
		student.setPhoneNumber(phoneNumber);
		student.setCity(city);

		return student;

	}

}

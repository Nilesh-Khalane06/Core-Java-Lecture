package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student{	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter your FirstName: ");
		String fname=sc.next();
		
		System.out.println("Enter your LastName: ");
		String lname=sc.next();
		
		System.out.println("Enter your MobileNumber: ");
		long mNumber=sc.nextLong();
		
		System.out.println("Enter your city: ");
		String city=sc.next();
		
		//1.directory path
		String directory="C:\\Users\\hp\\Music\\File Handling";
		
		//2.specify File Name
		String fileName="studentdetails.txt";
		
		
		File file=new File(directory+"\\"+fileName);
		
		try {
			//creation file
			if(file.createNewFile()) {
				System.out.println("file created");
				
			}else {
				System.out.println("file already exited");
				
			}
			
		FileWriter writer=new FileWriter(file, true);
			writer.write(id+":"+fname+":"+lname+":"+mNumber+":"+city+System.lineSeparator());
			writer.close();
			System.out.println("Student details in file: "+id+" "+fname+" "+lname+" "+mNumber+" "+city);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		finally {
			sc.close();
		}
		
	}

}

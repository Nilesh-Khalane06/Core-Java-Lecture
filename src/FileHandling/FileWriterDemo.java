package FileHandling;


import java.io.*;
import java.util.Scanner;

public class FileWriterDemo {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.next();
		
		System.out.println("please Enter your bithyear: ");
		int year=sc.nextInt();
		
		String username=name+year;
		System.out.println(username);
		
				// we want to store this username in a text file 
				// we need to specify location of file creation
				// text file creation will be taken care by java
				// writing in text file -> java
		//1.directoryPath
		String directoryPath="C:\\Users\\hp\\Music\\File Handling";
		
		//2.specify file name
		
		String fileName="username.txt";
		
		File file = new File(directoryPath+"\\"+fileName);
		
		try {
			
			if(file.createNewFile()) 
			{
				System.out.println("File created");
			}
			else
			{
				System.out.println("File already created");
			}

			FileWriter writer = new FileWriter(file, true);
			writer.write(username+System.lineSeparator());
			writer.close();
			System.out.println("username file details: "+username);
					
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
		
	}

}

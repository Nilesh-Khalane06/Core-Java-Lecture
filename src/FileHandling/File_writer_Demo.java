package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_writer_Demo {
	public static void main(String[] args) {
		
		String filepath="C:\\Users\\hp\\Music\\File Handling\\Practise.txt";
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(filepath));
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
				
			}
			System.out.println(line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

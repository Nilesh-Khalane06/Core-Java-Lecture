package FileHandling_FileReaderTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		
		String filePath="C:\\Users\\hp\\Music\\File Handling\\StudentData.txt";
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(filePath));
			String line;
			while((line=reader.readLine()) !=null) {
				//splite each line by ":"
				
				String[] parts=line.split(":");
				
				if(parts.length==5) {
					Student student=new Student();
					student.setId(Integer.parseInt(parts[0].trim()));
					student.setFname(parts[1].trim());
					student.setLname(parts[2].trim());
					student.setPhoneNumber(parts[3]);
					student.setCity(parts[4].trim());
					
					
					System.out.println(student);
					
					System.out.println("========");
					
				}else {
					System.out.println("Invalid line :"+line);
				}
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
}


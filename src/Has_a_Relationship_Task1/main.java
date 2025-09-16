package Has_a_Relationship_Task1;



public class main {
	
	public static void main(String[] args) {
		
		student s=new student();
		s.setName("Gopal");
		s.setId(101);
		
		Degree d=new Degree();
		d.setDegree("BSC");
		d.setField("IT");
		d.setPassingYear(2025);
		
		s.setDetails(d);
		
		System.out.println(s.toString());
		
		
	}
	
	

}

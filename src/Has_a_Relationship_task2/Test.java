package Has_a_Relationship_task2;



public class Test {
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmployeeId(101);
		e.setEmployeeName("Gopal");
		
		Experience ex=new Experience();
		ex.setEmployeeExperience("5 years");
		
		e.setDetails(ex);
		
		System.out.println(e.toString());
	
	
	

}
}

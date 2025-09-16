package Has_a_Relationship_task3;

public class Test {
	public static void main(String[] args) {
		
		Student s=new Student();
		s.setName("Prafull");
		
		Vehical v=new Vehical();
		v.setVehicalName("Unicorn");
		s.setDetails(v);
		
		RegistractionDetails r=new RegistractionDetails();
		r.setVehicalNo(4838);
		r.setYearManufacture(2021);
		v.setDetails(r);
		
		System.out.println(s.toString());
		
		
	}
	}
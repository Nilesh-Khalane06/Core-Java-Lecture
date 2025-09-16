package Has_a_Relationship_task3;

public class Student {
	private String name;
	
	private Vehical details;

	public Vehical getDetails() {
		return details;
	}

	public void setDetails(Vehical details) {
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student name=" + name + "\ndetails=" + details + "";
	}
	

}

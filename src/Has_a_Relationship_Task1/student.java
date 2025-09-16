package Has_a_Relationship_Task1;

public class student {
	
	private String name;
	
	private int id;
	
	private Degree details;
	
	

	@Override
	public String toString() {
		return "student name=" + name + "\nid=" + id + "\ndetails=" + details + "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Degree getDetails() {
		return details;
	}

	public void setDetails(Degree details) {
		this.details = details;
	}
	
	
	
	

}

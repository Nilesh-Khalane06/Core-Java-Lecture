package Has_a_Relationship;

public class Student {
	
	private int id;
	
	private String name;
	
	private String city;
	
	private PersonalDetails details;
	
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", details=" + details + "]";
	}

	public PersonalDetails getDetails() {
		return details;
	}

	public void setDetails(PersonalDetails details) {
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

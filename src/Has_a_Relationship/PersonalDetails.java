package Has_a_Relationship;

public class PersonalDetails {
	
	private String fatherName;
	
	private String motherName;

	
	
	@Override
	public String toString() {
		return "PersonalDetails [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	
	

}

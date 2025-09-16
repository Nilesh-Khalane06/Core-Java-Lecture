package Has_a_Relationship_Task1;

public class Degree {
	
	private String degree;
	
	private int passingYear;
	
	private String field;

	@Override
	public String toString() {
		return "\nDegree degree=" + degree + "\npassingYear=" + passingYear + "\nfield=" + field + "";
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}

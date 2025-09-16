package Has_a_Relationship_task3;

public class Vehical {
	
	private String vehicalName;
	
	private RegistractionDetails details;
	
	public RegistractionDetails getDetails() {
		return details;
	}

	public void setDetails(RegistractionDetails details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Vehical vehicalName=" + vehicalName + "\ndetails=" + details + "";
	}

	public String getVehicalName() {
		return vehicalName;
	}

	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}

	

}

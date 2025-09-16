package Has_a_Relationship_task3;

public class RegistractionDetails {
	
	private int vehicalNo=10;
	
	private int yearManufacture;

	public int getVehicalNo() {
		return vehicalNo;
	}

	@Override
	public String toString() {
		return "RegistractionDetails vehicalNo=" + vehicalNo + "\n yearManufacture=" + yearManufacture + "";
	}

	public void setVehicalNo(int vehicalNo) {
		this.vehicalNo = vehicalNo;
	}

	public int getYearManufacture() {
		return yearManufacture;
	}

	public void setYearManufacture(int yearManufacture) {
		this.yearManufacture = yearManufacture;
	}

}

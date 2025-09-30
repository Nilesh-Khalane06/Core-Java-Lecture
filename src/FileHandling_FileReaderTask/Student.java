package FileHandling_FileReaderTask;

public class Student {
	
	private int id;
	
	private String fname;
	
	private String lname;
	
	private String phoneNumber;
	
	private String city;
	
	
	@Override
	public String toString() {
		return "Student id: " + id + " \nfname: " + fname + " \nlname: " + lname + "\nphoneNumber: " + phoneNumber
				+ "\ncity: " + city + "";
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	

}

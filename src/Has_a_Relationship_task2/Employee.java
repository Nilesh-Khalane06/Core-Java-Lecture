package Has_a_Relationship_task2;

public class Employee {
	
	private String employeeName;
	private int employeeId;
	private Experience details;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Experience getDetails() {
		return details;
	}
	public void setDetails(Experience details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", details=" + details + "]";
	}
	
	
	
	

}

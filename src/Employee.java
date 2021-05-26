

public class Employee extends StaffMember {
	
	private String ssn;
	private double payRate;
	
	public Employee(String name, String address, String phone, String ssn, double payRate)
	{
		super(name, address, phone);
		this.ssn = ssn;
		this.payRate = payRate;
	}
	
	public String toString()
	{
		return super.toString() + ", ssn is " +ssn+ " , payrate is " + payRate;
	}
	
	public double pay()
	{
		return payRate;
	}
}



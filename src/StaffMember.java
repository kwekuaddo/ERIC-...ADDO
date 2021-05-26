

public abstract class StaffMember {
	
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String name, String address, String phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String toString()
	{
		return "Name is " +name + " , address is " + address+ " , phone is " +phone;
	}
	
	public abstract double pay();

}



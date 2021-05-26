

public class Hourly extends Employee {

	private int hours;
	
	public Hourly(String name, String address, String phone, String ssn, double payRate, int hours)
	{
		super(name, address, phone, ssn, payRate);
		this.hours = hours;
	}
	
	public double pay()
	{
		return super.pay() * hours;
	}
	
	public String toString()
	{
		return super.toString() + " , the number of hours are " + hours;
	}
}



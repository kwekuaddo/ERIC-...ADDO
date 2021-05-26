
public class Executive extends Employee{

	private double bonus;
	
	public Executive(String name, String address, String phone, String ssn, double payRate, double bonus)
	{
		super(name, address, phone, ssn, payRate);
		this.bonus = bonus;
	}
	
	public void setBonus(double b)
	{
		bonus = b;
	}
	
	public String toString()
	{
		return super.toString() + " , bonus is " + bonus;
	}
	
	public double pay()
	{
		return super.pay() + bonus;
	}
	
	
}




//********************************************************************
// Staff.java Author: Lewis/Loftus
//
// Represents the personnel staff of a particular business.
//********************************************************************
public class Staff
{
	StaffMember[] staffList;
	//-----------------------------------------------------------------
	// Sets up the list of staff members.
	//-----------------------------------------------------------------
	public Staff ()
	{
		staffList = new StaffMember[9];
		staffList[0] = new Executive ("Kwame", "123 Main Line",
				"555-0469", "123-45-6789", 2423.07, 0);
		staffList[1] = new Employee ("Appiah", "456 Off Line",
				"555-0101", "987-65-4321", 1246.15);
		staffList[2] = new Employee ("Danso", "789 Off Rocker",
				"555-0000", "010-20-3040", 1169.23);
		staffList[3] = new Hourly ("Tracy", "678 Fifth Ave.",
				"555-0690", "958-47-3625", 10.55, 0);
		staffList[4] = new Volunteer ("Grace", "987 Suds Blvd.",
				"555-8374") ;
		staffList[5] = new Volunteer ("Eno", "Asonko Lane",
				"02145421");
		staffList[6] = new Commission ("Kofi", "Tudu", "347-322-8664", "123-11-1111", 6.25, 0, (6.25*0.2));
		staffList[7] = new Commission ("Mensah", "Aburi", "212-233-8264", "083-11-1331", 9.75, 0, (9.75*0.2));
		staffList[8] = new Employee ("Abigail", "Nsawam","09458172", "24581", 1169.23);
		((Executive)staffList[0]).setBonus (500.00);
		
	}
	//-----------------------------------------------------------------
	// Pays all staff members.
	//-----------------------------------------------------------------
	public void payday ()
	{
		double amount;
		for (int count=0; count < staffList.length; count++)
		{
			System.out.println (staffList[count]);
			amount = staffList[count].pay(); // polymorphic
			if (amount == 0.0)
				System.out.println ("Thanks!");
			else
				System.out.println ("Paid: " + amount);
			System.out.println ("------------------------------------");
		}
	}
}


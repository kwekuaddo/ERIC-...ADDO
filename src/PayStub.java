

public class PayStub {
	
	public static void main(String[] args){
		StaffMember [] list = new StaffMember[4];
		list[0] = new Executive("Danny", "123 Tema", "02441698", "121-1012", 5000, 2000);
		list[1] = new Hourly("Akosa", "101 Takoradi", "05504141", "123-12-1223", 50, 40);
		list[2] = new Volunteer("Esther", "off Lake Bosomtwe", "021450114");
		list[3] = new Volunteer("Esi", " Prison Junction", "021458478");
		
		for (int i=0; i<=5; i++)
		{
			System.out.println(list[i]);
			System.out.println(list[i].pay());
		}
		
	}

}



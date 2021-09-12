public class Person_Details {
	public  void Person_name()
	{
		String name ="aditya ";
		String fthername = "adi";
		String adress = " Doorno 3/55/96 ,Rajahmundry , ED.";
		System.out.println("person name "+name );
		System.out.println("father name"+fthername );
		System.out.println("Adress" +adress );
		System.out.println();
	}
	public void Qualification()
	{
		double tp = 10.0;
		double ip = 9.8;
		double eng = 78.56;
		System.out.println("Tenth persentage "+tp);
		System.out.println("Inter persentage "+ip );
		System.out.println("Engeneering persentage " +eng);
	}

	public static void main(String[] args) {
		 
		Person_Details obj = new Person_Details();
		obj.Person_name();
		obj.Qualification();
		


	}

}

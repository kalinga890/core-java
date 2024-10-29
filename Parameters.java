public class Parameters{

	public static void main(String[] args) {
		
		foodorder("chicken");
		foodorder("cake");

		companyinformation("microsoft", "i am excited to work this comapny" );
		hospitalinformation("balaji hospital", 4.9d, 583122, 1234123412,0.4f);
		hostel("prajwal", 200, "everyday clean the rooms", "dosa",300 );
		marketingrate("brinjal", 100, "purpal" );
		foodorder("mutton");

		hospitalinformation("governament hospital",4.5d,583227, 1111111111, 0.5f );
		
		companyinformation("ibm", "i rejected to this campany due to lowsalary");




	}


	public static void foodorder(String name){

		System.out.println("Food order item " + name);
	}


	public static void companyinformation(String name, String messege ){

		System.out.println("Company name is " + name);
		System.out.println("Messege is " + messege );
	}


	public static void marketingrate(String name, int rate, String colour){
		System.out.println("vegetable name is "  + name);
		System.out.println("marketing rate is " + rate);
		System.out.println( "what types colour is " + colour);
	}

	

	public static void hostel(String name, int number,String messege,String food, int student){
		System.out.println("hostel warden name is " + name);
		System.out.println("Total obc number is " + number);
		System.out.println("Messege is " + messege);
		System.out.println("my fovarite food is " + food);
		System.out.println("total number of engineering student is " + student);

			
		
	}
	public static void hospitalinformation(String name,double rating,long pincode, int number, float percentage){
		System.out.println("hospital name is " + name);
		System.out.println("hospital rating is " + rating);
		System.out.println("hospital pincode is " + pincode);
		System.out.println("hospital helpline number " + number);
		System.out.println("hospital patient percentage " + percentage);
		

	}
}
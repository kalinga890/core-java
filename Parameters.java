public class Parameters{

	public static void main(String[] args) {
		
		foodorder("chicken");
		foodorder("cake");
		foodorder("mutton");

		companyinformation("microsoft", "i am excited to work this comapny" );
		companyinformation("ibm", "i rejected to this campany due to lowsalary");

		marketingrate("brinjal", 100, "purpal" );

		hostel("prajwal", 200, "everyday clean the rooms", "dosa" );
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

	

	public static void hostel(String name, int Number,String messege,String food){
		System.out.println("hostel warden name is " + name);
		System.out.println("Total obc number is " + Number);
		System.out.println("Messege is " + messege);
		System.out.println("my fovarite food is " + food);
		
		
		
	}
}
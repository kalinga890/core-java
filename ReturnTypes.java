public class ReturnTypes{

	public static void main(String[] args) {

	int result =subtraction(40,20);
	

    int mul = multipication(30,30);

    int sub = submarks(10,40);
	  
	int div = division(80,20);
      
    int studt =student(100,60);

    String college = addcollege("gec", "gangavathi");

      

	}

	public static int  subtraction(int a,int b){
		int subtraction = a - b;
		System.out.println(subtraction);
		return subtraction;
		
	}	

	public static int multipication(int a,int b){
		int addmultipication = a * b;
		System.out.println(addmultipication);
		return addmultipication;
	}

	public static String addcollege(String name,String village){
		String addcollege = "gec" + "gangavathi";
		System.out.println(addcollege);
		return addcollege;
		
	}
	
	public static int submarks(int m,int h){
		int addsubmarks = m + h;
		System.out.println(addsubmarks);
		return addsubmarks;
	}
	public static int division(int c, int d){
		int adddivision = c / d;
		System.out.println(adddivision);
		return adddivision;
	}

	public static int student(int obc,int st){
		int totalstudent = obc + st;
		System.out.println(totalstudent);
		return totalstudent;
	}
}


	
	


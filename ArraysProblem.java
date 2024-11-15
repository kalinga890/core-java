public class ArraysProblem{

	public static void main(String[] args) {
		
		int[] arr={10,20,30,40,50,60,70,80,90,100};

		int returnvalue = Sumofarray(arr);
		System.out.println(returnvalue);

		int[] array={1,4,5,3,4,6,2,1,3,5};

		int totalcount= Findoccurence(array,5);
		System.out.println(totalcount);


}



 public static int Sumofarray(int[] array){

 	int total=0;

 	for(int i = 0; i<array.length;i++){
 		total=total+array[i];
 	}
     return total;

 }

 public static int Findoccurence(int[] array,int input){

 	int count=0;
 	for(int i =0; i<array.length;i++){
 		if(array[i]==input){
 			count++;
 		}
 	}
 	return count;
 }

}
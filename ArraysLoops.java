public class ArraysLoops{

	public static void main(String[] args) {
		

		byte[] marks  = {20,40,50,10,30,60,70,90,100,25}; // using literal method


		for (int i=0; i<10; i++){

		System.out.println(marks[i]);
	}
	    byte[] heatingPower = new byte[10]; // using key value method

		heatingPower[0]= 20;
		heatingPower[1]= 30;
		heatingPower[2]= 40;
		heatingPower[3]= 50;
		heatingPower[4]= 60;
		heatingPower[5]= 70;
		heatingPower[6]= 80;
		heatingPower[7]= 90;
		heatingPower[8]= 100;
		heatingPower[9]= 45;

		for(int b=0;b<10;b++){

			System.out.println(heatingPower[b]);
		}



		short[] riversInindia= {150,200,300,400,600,700,350,250,555,900};  // using literal method

		for(int a=9;a>0;a--){

			System.out.println(riversInindia[a]);
		}

		short[] airportsInindia= new short[10]; // using key value method

		airportsInindia[0]=230;
		airportsInindia[1]=530;
		airportsInindia[2]=630;
		airportsInindia[3]=730;
		airportsInindia[4]=250;
		airportsInindia[5]=260;
		airportsInindia[6]=990;
		airportsInindia[7]=450;
		airportsInindia[8]=670;
		airportsInindia[9]=999;
        
        for(int c=9;c>0;c--){

        	System.out.println(airportsInindia[c]);
        }

        int[] CityPopulation = {10000,24456,345673,24689,888678,34563,56743,28943,34763,76541};  // using literal method

        for(int d=4;d>0;d--){

        	System.out.println(CityPopulation[d]);
        }

        int[] DataStorage= new int[10]; // using key value method

		DataStorage[0]=45673;
		DataStorage[1]=55683;
		DataStorage[2]=35673;
		DataStorage[3]=55673;
		DataStorage[4]=65673;
		DataStorage[5]=99989;
		DataStorage[6]=85673;
		DataStorage[7]=43473;
		DataStorage[8]=65673;
		DataStorage[9]=75673;

		for(int e=5;e>=0;e--){
			System.out.println(DataStorage[e]);
		}
         
        int[] totaltaluks={1000,2000,3000,4000,5000,6000,7000,8000,9000,10000};

        for(int f = 5;f<=9;f++){

        	System.out.println(totaltaluks[f]);
        }

         int[] newTotaltaluks={1000,2000,3000,4000,5000,6000,7000,8000,9000,10000};

        for(int g = 0;g<10;g=g+2){

        	System.out.println(totaltaluks[g]);
        }

        float[] percentage={10.1f,20.2f,30.3f,40.4f,50.5f,60.6f,70.7f,80.8f,90.9f,100.10f};

        for(int h =0;h<10;h=h+2){
        	System.out.println(percentage[h]);
        }

        double[] balance={100.11d,200.22d,300.33d,400.44d,500.55d,600.66d,700.77d,800.88d,900.99d,100.01d};

        for(int j=0;j<10;j=j+3){
        	System.out.println(balance[j]);
        }

        
       
		}
}
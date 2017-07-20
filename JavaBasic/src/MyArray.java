public class MyArray {
	public static void main(String[] args){
		int [] myArray= new int [10];
		
		myArray[0]=99;
		myArray[1]=34;
		myArray[2]=20;
		myArray[3]=39;
		
		//System.out.println(myArray[2]);
		
		String[] Students={"Aminul", "Hello", "How", "Are ", "You"};
		for(int p=0; p<Students.length;p++){
			System.out.println(Students[p]);
		}
		
		//System.out.println(Arrays.toString(Students));
		
		int [][] values ={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int l=0; l < values.length; l++){
			for(int u=0; u<values[l].length; u++){
				System.out.println("My 2nd Array values are: " +values[l][u]);
			}
		}
		
		
		
	}

}


public class SampleClass {

	public static void main(String[] args) {

		
		int x; //here the int is the datatype.
		int i[]; //we have an array of integers named i
		i= new int[10]; //size of the array is 10 elements, 10 places index starts 
		
		for(x=0; x<10; x++) //loop
		{
			if(x % 2 != 0) // put a condition...if the value of x is odd then...
			i[x] = x;
		}
		for (x=0; x<10; x++)
		{
			System.out.println("The value of var i = " + i[x]);
			//whats in the quotes is whats called literal
		}
	}
}
		//if the class is not public, the class loader cannot access the main method
		//the main method is the starting point for a java application(non web based)
		// to run fn + ctrl + f11



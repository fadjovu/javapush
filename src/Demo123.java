
public class Demo123 {

	public static void main(String[] args) {
		
//		int x = 78; //primitive
		
//		integer x = 78; //Autoboxing. Integer is a wrapper class built around int
		
		
		String age = "56";
		int x = Integer.parseInt(age); // converting from string to integer
				
		System.out.println(x + 23);
		
		
		int tempr = 99; 
		
		
		String stempr = String.valueOf(tempr);//convert to string
		
		System.out.println(stempr);
	}

}

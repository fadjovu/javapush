import java.util.Scanner;

class Cust
{
	public String fname;
}

public class Sample2 {

	public static void main(String[] args) {
		// taking input from the user
		//int, float, double, String Character, char, byte, Boolean, Float
		//Those that start with capital are class
		// start with small letters are primitive
		
		String fname; //
		int age;
		
		System.out.println("Enter your name and age:");
		Scanner s = new Scanner(System.in); // we have a constructor on the right
		//system.in means keyboard
		//the input is coming from the keyboard which is called a system std input device.
		fname = s.nextLine();//this is a method used to accept user input in the form string
		age = s.nextInt();
		
		System.out.println("Welcome MR. " +fname+ ". Your age is " + age);
	}

}

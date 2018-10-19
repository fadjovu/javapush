
import java.lang.reflect.Array;
import java.util.Scanner;

public class UserMainCodedemo {
	
	public int sumOfSquaresOfevenDigits()
	{

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int sav = s.nextInt();
		
		int rem;
		int sum = 0;
		
		
		while (sav != 0) {
			// step 1
			rem = sav%10;
			System.out.println("current digit: " + rem);
			// step 1.1
			if ((rem%2)==0) {
				// step 1.2
				System.out.println(rem + " is even!! now add the sum");
				sum = sum + rem*rem;
			}
			
			// step 2
			sav = sav/10;
		}
		
		System.out.println(sum);
		return sum;		
	}
		


	public static void main(String[] args) {

		UserMainCodedemo sobj = new UserMainCodedemo();
		
			sobj.sumOfSquaresOfevenDigits();
			
	}

}

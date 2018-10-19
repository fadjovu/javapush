import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		//simple loop to show numbers from 2 to 20
		//problem: accept 5 numbers from user, break the loop id person enters neg Number.class
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 5 positive numbers:");
		int i, x;
		for(i=0; i<5; i++)
		{
			x=s.nextInt();
			if (x < 0) {
				
			System.out.println("Ooops ! that was a wrong number. Please re enter");
				continue;} //break will exit the loop 
			System.out.println(x);
		}
	}

}

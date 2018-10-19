import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		int opt;
		Scanner s= new Scanner(System.in);
		System.out.println("1.Samsung\n2.Apple\n3.Toshiba\n4.Sony\nEnter your choice:");
		opt = s.nextInt();
		switch (opt)//switch construct
		{
		case 1:
			System.out.println("Welcome to Samsung");
			break; //break, else it jumps to the next case
		case 2:
			System.out.println("Welcome to Apple");
			break;
		case 3:
			System.out.println("Welcome to Toshiba");
			break;
		case 4:
			System.out.println("Welcome to Sony");
			break;
		case 5:
			System.out.println("Welcome to Nokia");
			break;
		default:
			System.out.println("invalid input");
			
		}
	}
	
	

}

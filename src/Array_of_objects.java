import java.util.Scanner;

class Dept123
{
	String dname;
	public void set_name()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter dept name: ");
		dname = s.nextLine();
	}
	public void display()
	{
	System.out.println("Dept name = " + dname);	
	}
}

public class Array_of_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dept123 dobj[]; //array of objects
		
		dobj = new Dept123[5];//size....of the array. how many objects you need
		System.out.println("Enter data for 5 depts....");
		
		for (int i =0; i<5; i++)
		{
			dobj[i] = new Dept123(); //each obj is getting initialized here
			dobj[i].set_name();
		}
		for (int i =0; i<5; i++)
		{
			dobj[i].display();
		
		}
		

	}

}

import java.util.Scanner;

class Emp123
{
	String ename, dept, mgr_name;
	double salary;
	
	public void set_Data() //accept data for emp
	{
		System.out.println("Enter employee data");
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter employee nanme, dept, and mgr name please");
		
		ename = s.nextLine();
		dept = s.nextLine();
		mgr_name = s.nextLine();
		
		System.out.println("Enter Salary");
		salary = s.nextFloat();
	}
	public void display()
	{
		System.out.println("Displaying the empl data");
		System.out.println("Name is " + ename);
		System.out.println("Dept is " +dept);
		System.out.println("Mgr is " + mgr_name);
		System.out.println("Salary " + salary);
		
	}




}








public class EmployeeDetails {

	public static void main(String[] args) {
		
		Emp123 obj = new Emp123();
		Emp123 obj1 = new Emp123();
		obj.set_Data();
		obj.display();
		
		obj1.set_Data();
		obj1.display();
	}

}

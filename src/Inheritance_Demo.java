
class Employee //This is super class
{
	String ecode, ename, mgr;
	public void get_Data()
	{
		ecode = "1";
		ename = "Jack";
		mgr = "Tim";
	}
	public void dis()
	{
		System.out.println("E code = " + ecode);
		System.out.println("E name = " + ename);
		System.out.println("E Mgr = " + mgr);
	}

}
class Contract extends Employee //contract class is a sub class of Employee
{
	String agency, refcode;
	public void get_Data()
	{
		super.get_Data(); //going to call the super class method
		agency = "First Choice HR";
		refcode = "R0098990";
	}
	public void dis()
	{
		System.out.println("E code = " + ecode);
		System.out.println("E name = " + ename);
		System.out.println("E Mgr = " + mgr);
	}
}
class Regular extends Employee
{
	//empty class
}




public class Inheritance_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}

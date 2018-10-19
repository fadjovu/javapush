interface ICo_policy
{
public void policies();
}
interface IProduction
{
	public void prod_control();
}
interface IMyInterface extends IProduction, ICo_policy
{
	public void register();// empty methods abstract
	public void exitprocess();
}

abstract class A implements IMyInterface 

{	public static void fn()
	{
	System.out.println("This is just a sample fn of class A");
	}

	public void register() {
		System.out.println("This class follows the registration process");
	}

	@Override
	public void exitprocess() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Demo1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.register();
		a.exitprocess();
		a.fn();
		
	}
}

	



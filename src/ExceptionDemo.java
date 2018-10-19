class Invalid_Bonus extends Exception
{
	public void showmsg()
	{
		System.out.println("The bonus calculated is invalid, error");
	}
}

//bous exceeding $1500 is invalid. and it is going to throw and Invalid bonus exception.

class Calc_Bonus
{
	public void get_bonus_amt(double b) throws Invalid_Bonus  //based on condition
	{
		if (b>1500)
			throw new Invalid_Bonus();
		else
			System.out.println("Bonus allowed");
	}
}


public class ExceptionDemo {

	public static void main(String[] args) {

	Calc_Bonus cb = new Calc_Bonus();
	try {
		cb.get_bonus_amt(1500);
	} catch (Invalid_Bonus e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		e.showmsg();
	}
	finally
	{
		System.out.println("This is the end");
	}
	}

}

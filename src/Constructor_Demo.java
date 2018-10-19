class Cost_Centre
{
	String cc_name;

		public Cost_Centre()
		{
			cc_name = "Name is not assigned .....!!";
		}
		public Cost_Centre(String cc_name)
		{
			this.cc_name = cc_name;
		}
		public void display()
		{
			System.out.println("C Centre name = " + cc_name);
		}
}

class Dept
{
	String dept_name;
	String Mgr_name;
	Cost_Centre cc; //here cc is an attribute
	Cafe cf;
	
	public void get_Data()
	{
		dept_name = "Account";
		Mgr_name = "Tim";
		cc= new Cost_Centre("Training");
		cf = new Cafe();
	}
	public void display()
	{
		System.out.println("Dept name =" + dept_name);
		System.out.println("Mgr =" + Mgr_name);
		System.out.println("Cost Centre name =");
		cc.display();
		
		System.out.println("The cafe name is: " + cf.get_cafe_name());
	}

}

class Cafe
{
	String cafe_name;
	public Cafe ()
	{
		cafe_name = "Starbucks";
	}
	public String get_cafe_name() // it is not displaying but it is returning the cafe value
	{
		return cafe_name;
	}

public class Constructor_Demo {


}	
	public static void main(String[] args) {
		
		Dept obj = new Dept();
		obj.get_Data();
		obj.display();

	}

}

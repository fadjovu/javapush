class Project 
{
	String pname;
	public Project()
	{
		pname = "P398494";
	}
	class secret_files //inner
	{
		String sec_code = "23434";
		public void dispcode()
		{
			System.out.println(sec_code);
		}
	}
	public void show_prj_details()
	{
		secret_files cf = new secret_files();
				cf.dispcode();
				System.out.println(pname);
	}
}



public class Inner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Project p = new Project();
					p.show_prj_details();
	}

}

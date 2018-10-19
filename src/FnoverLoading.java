class HR
{
	public void recruit()
	{
		System.out.println("HR is ready to recruit");
	}
	public void recruit( String Mgr_name)
	{
		System.out.println("HR is ready. The Mgr is " + Mgr_name);
	}
	public void recruit(String Mgr_name, int teamsize)
	{
		System.out.println("HR is ready. The Mgr is " + Mgr_name + "the team size is " + teamsize);
	}

}



public class FnoverLoading {

	public static void main(String[] args) {
		HR h = new HR();
		h.recruit();
		h.recruit("Uttam");
		h.recruit("Uttam", 6);
	}

}

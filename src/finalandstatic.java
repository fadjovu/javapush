class Weekdays
{
	public static final int Mon = 1; //a static var can be called by just qualifying with classname
	public static final int Tue = 2;//a var declared "final" cannot be modified
	public static final int Wed = 3;
}



public class finalandstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Weekdays.Mon);
		
		int i, j, z;
		i=90;
		j = 34;
		z=0;
		i++; //unary
		System.out.println(i);
		
		i=i+j; //here + is a binary operator
		
		z= (i>j) ?i:j;
		System.out.println(z);
				

	}

}

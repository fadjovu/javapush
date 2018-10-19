
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		float y;
		double z;
		x =23;
		y= 432.34f; // whenever there's a decimal value, java takes it as double.
		z= 9090.23;		
		
		z=y; //implicit - converted from float on right to double on left
		x= (int) z; //explicit
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			
	}

}

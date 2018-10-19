import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Car {
			String brand;
			double price;
		public Car(String brand, double price) {
			this.brand = brand;
			this.price = price;
		}
		public void showcar()
		{
			System.out.println("Brand =" + brand + "Price = " + price);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter car data");
		boolean flag = true;
		String brand;
		double price;
		
		ArrayList<Car> listofcars = new ArrayList<Car>();
		
		Scanner s = new Scanner(System.in);
		while(flag)
		{
			System.out.println("Enter brand");
			brand = s.nextLine();
			System.out.println("Enter price:");
			price = s.nextDouble();
			
			listofcars.add(new Car(brand, price));
			
			System.out.println("Press any key to continue, N to exit");
			s.nextLine();
			String ans = s.nextLine();
			if(ans.equals("N"))
				flag=false;
		}
			//display all cars
		Iterator i = listofcars.iterator();
		while(i.hasNext())
		{
			Car c = (Car) i.next();
			c.showcar();
		}
	
	}
	

}

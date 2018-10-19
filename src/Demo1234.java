import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Demo1234 {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(8);8*/
		
		/*Byte b = new Byte(b);
		ArrayList<Byte> list = new ArrayList<Byte>();
		list.add(b);*/
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Uttam");
		list.add("James");
		list.add("Tim");
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(String)i.next());
		}
		Stack <Integer> stack = new Stack<Integer>();
		stack.push(23);
		stack.push(12);
		stack.push(67);
		
		System.out.println(stack.search(78));
	}
	
	

}

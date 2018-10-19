import java.util.HashMap;

public class CollectionDemo {

	public static void main(String[] args) {

//		MAP
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Let us C");
		map.put(102, "Operating System");
		map.put(103, "Data Communication and Networking");
		
		for(String s:map.values()) {
			
			System.out.println(s);
		}
		System.out.println(map.containsKey(101));
	}

}

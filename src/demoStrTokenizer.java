import java.util.StringTokenizer;

public class demoStrTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer("This ,is,my,book, ",",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	

}

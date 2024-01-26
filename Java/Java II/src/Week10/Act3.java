package Week10;

public class Act3 {
	public static void main(String[] args) {
		String x = "abc";
		String y = x.replace('a', 'd');
			
		y = y + "xyz"; 
		System.out.println(y);

		x=y.toUpperCase(); 
		System.out.println(x);
	}
}

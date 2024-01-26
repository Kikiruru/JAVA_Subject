package Week11;

public class Act2 {
	public static void main(String[] args) {
		Double s = Double.parseDouble("345.12");
		@SuppressWarnings("deprecation")
		Integer i = new Integer("100");
		int i2 = i.intValue();
		System.out.println(s);
		System.out.println(i2);
	}
}

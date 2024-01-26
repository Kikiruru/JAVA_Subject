package Week04;

public class Number13 {
	public static void main(String[] args) {
		String str1 = "PS" + 1 + 2 + 3;
		String str2 = "1" + 2 + 3 + "PS";
		String str3 = 1 + 2 + 3 + "PS";
		String str4 = 1 + 2 + "3"+ "PS";
		
		System.out.println(str1 + "\t" + str2 + "\t"+ str3 + "\t"+ str4);
	}
}

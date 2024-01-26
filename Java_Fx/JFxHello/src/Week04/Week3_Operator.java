package Week04;

public class Week3_Operator {
	public static void main(String[] args) {
		char big_i = 'I'; // I는 73번 (ASCII코드, 10진수)
		int num = 12;
		String temp = "phone";
		
		System.out.println(temp + num + big_i);
		System.out.println(big_i + temp + num);
		System.out.println(temp + big_i + num);
		System.out.println(big_i + num + temp);
	}
}

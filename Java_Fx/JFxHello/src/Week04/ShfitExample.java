package Week04;

public class ShfitExample {
	public static void main(String[] args) {
		int num = 16;
		
		System.out.print("num : "+ num +" --> ");
		System.out.println(num << 4); // 빈칸 
		num = 8;
		System.out.print("num : "+ num +" --> ");
		System.out.println(num >> 2); // 빈칸
		num = 0b10;
		System.out.print("num : 0b"+ Integer.toBinaryString(num) +" --> ");
		System.out.print(num << 8); // 빈칸
	}
}

package Week03;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125; //byte의 범위(-128~127)
		int var2 = 125; //정수의 범위(-2,147,483,648~2,147,483,647)
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1:"+ var1 +"\t"+ "var2: "+ var2);
		}
	}
}

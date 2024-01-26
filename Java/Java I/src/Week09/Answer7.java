package Week09;

public class Answer7 {
	public static void main(String[] args) {
		int[] num = new int[20];
		int[] even;
		int[] odd;
		int cnt1 = 0, cnt2 = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*100) + 1;
			if(num[i]%2 == 0)
				cnt1++;
			else
				cnt2++;
		}
		even = new int[cnt1];
		odd = new int[cnt2];
		
		cnt1 = 0; cnt2 = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				even[cnt1] = num[i];
				cnt1++;
			}
			else {
				odd[cnt2] = num[i];
				cnt2++;
			}
		}
		
		System.out.println("============ 원본 배열 ============");
		for(int i = 0; i < num.length; i++)
			System.out.print(num[i] +"  ");
		System.out.println("\n======== 짝수를 원소로 갖는 배열 ========");
		for(int i = 0; i < even.length; i++)
			System.out.print(even[i] +"  ");
		System.out.println("\n======== 홀수를 원소로 갖는 배열 ========");
		for(int i = 0; i < odd.length; i++)
			System.out.print(odd[i] +"  ");
	}
}

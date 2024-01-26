package Week09;
//마지막 요소가 앞으로 오게 해야 함
//첫번째 요소가 맨뒤로 가게 해버림
public class Answer8 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int[] num2 = new int[10];
		int temp;
		
		System.out.println("========== 원본 ==========");
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
			System.out.print(num[i] +"  ");
		}
		temp = num[0];
		for(int i = 0; i < num.length - 1; i++)
			num2[i] = num[i+1];
		
		/* 수정하면
		 for(int i = 0; i < num.length - 1; i++)
		 	num2[i + 1] = num[i];
		 num2[0] = num[num.length - 1]
		 */
		
		num2[num2.length-1] = temp;
		System.out.println("\n====== 이동 후 배열 내용 ======");
		for(int i = 0; i < num2.length; i++)
			System.out.print(num2[i] +"  ");
	}
}

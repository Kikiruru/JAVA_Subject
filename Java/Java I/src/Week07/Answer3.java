package Week07;

public class Answer3 {
	public static void main(String[] args) {
		int hap = 0; //합 
		int total = 0; //최종 합 
		
		for(int i=1;i<=10;i++) {
			for(int j=1; j<=i; j++) {
				hap += j;
			}
			System.out.printf("1 ~ %d 까지 합 : %d\n",i,hap);
			total += hap;
			hap = 0;
		}
		System.out.println("total = "+ total);
	}
}

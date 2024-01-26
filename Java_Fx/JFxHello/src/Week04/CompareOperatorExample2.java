package Week04;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		//System.out.println(1 == 1.0);
		double v1 = 0.1;
		float v2 = 0.1f;
		System.out.println((v1+0f) == v2);
		System.out.println((v1*1f) == v2);
		System.out.println((float)(v1*10)==(int)(v2*10));
		System.out.println((v1+0f*(300/10)-(int)20.5) == (double)(v2+0f*(300/10)-(int)20.5));
	}
}

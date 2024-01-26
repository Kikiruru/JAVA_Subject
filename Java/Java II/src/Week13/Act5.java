package Week13;

class MyMath <T extends Number> {
	public double getAverage(T[] list) {
		double sum = 0;
		for(T i : list) {
			sum += i.doubleValue();
		}
		return sum / list.length;
	}
}

public class Act5{
	public static void main(String[] args) {
		Integer[] list = { 32,5,36,8,41,74,59,9, 11 };
		Byte[] blist = {4,12,7,84,23,4};
		
		MyMath<Integer> m = new MyMath<Integer>();
		MyMath<Byte> bm = new MyMath<>();
		System.out.printf("%.2f\n",m.getAverage(list));
		System.out.printf("%.2f\n", bm.getAverage(blist));
	}
}


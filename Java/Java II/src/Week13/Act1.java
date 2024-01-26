package Week13;

final class MyAlgorithm {
	public static <T extends Number> T max(T x, T y) {
		return x.doubleValue() > y.doubleValue() ? x : y;
	}
}
public class Act1 {
	public static void main(String[] args) {
		System.out.println(MyAlgorithm.max(34, 20));
	}
}


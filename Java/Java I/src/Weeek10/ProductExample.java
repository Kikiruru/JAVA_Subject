package Weeek10;

public class ProductExample {
	public static void main(String[] args) {
		Product p = new Product("빙수", 5500);
		System.out.println(p.toString());
		System.out.println("빙수 2개 가격 : "+ p.calCost(2));
	}
}

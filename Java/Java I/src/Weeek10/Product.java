package Weeek10;
/*
제품 관리를 위한 클래스 Product를 작성하시오.
Product 클래스는 제품명과 가격을 가지며,
매개변수로 구입 개수를 받아 구입가격을 반환하는 calCost() 메소드,
제품정보를 출력하는 toString() 메소드로 이루어진다.
Product 클래스를 작성하고 객체를 생성하여 테스트 하라. 
*/
public class Product {
	String name;
	int cost;
	
	//생성자로 필드 초기화 
	Product(String name, int cost){ //제품명, 가격 
		this.name = name;
		this.cost = cost;
	}
	int calCost(int cnt) {
		return cost*cnt;
	}
	
	public String toString() { //객체 내용 문자열 반환 -> public String 사용 
		return "name : "+ name +"\tcost : "+ cost;
	}
}

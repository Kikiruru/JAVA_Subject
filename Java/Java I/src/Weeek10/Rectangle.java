package Weeek10;

public class Rectangle { //필드, 메소드, 생성자 
	//속성(데이터):필드선언
	int w, h; //가로, 세로
	//생정자를 따로 안만들면 따로 초기화가 된다. 
	/*
	//생성자 - 객체 초기화
	Rectangle(){
		this(1,1); // h = 1; w = 1;
	} //클래스명과 동일해야 함
	
	Rectangle(int w){
		h = 1;
		this.w = w; //매개변수와 필드를 구분하기 위해 this 사용
		// this(w, 1)로 사용할 수도 있다.
	} //오버로딩: 여러개가 정의 될 수 있다.
	
	Rectangle(int w, int h){
		this.h = h; //세로 
		this.w = w; //가로 
	}
	*/
	//동작:데이터 변경, 조작 -> 메소드 
	int area(){ //넓이 반환 
		return w*h; //넓이 계산 반환 
	}
	/* area 메소드는 클래스 안에 있기 때문에 클래스
	* 안에 있는 필드 w, h를 쓸 수 있다.
	*/
	
	//둘레 반환 메소드 
	int perimeter() {
		return 2*(w+h);
	}
}

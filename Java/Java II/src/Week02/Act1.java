package Week02;

import java.util.Scanner;

class Circle{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
		System.out.printf("radius = %.2f\n", radius);
	}
	
	public double getArea() { return 3.14 * radius*radius;}
}

public class Act1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Circle[] c = new Circle[5];
		double radius;
		
		for(int i = 0; i < 5; i++) {
			radius = in.nextDouble();
			c[i] = new Circle(radius);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d] Area : %.2f\n", i+1, c[i].getArea());
		}
		
		in.close();
	}
}

class Date{
	int year, month, day;
	String[] monthEng = {"January", "February", "March",
		"April", "May", "June", "July", "August", "September",
		"October", "November", "December"};
	
	public Date() {
		
	}
	
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public void print1() {
		System.out.println("\""+ year + "."+ month +"."+ day +"\"");
	}
	
	public void print2() {
		System.out.println("\""+ monthEng[month - 1] +" "+ day + ","+ year +"\"");
	}
}
/*
public class Act1{
	public static void main(String[] args) {
		Date d = new Date(2012, 7, 12);
		d.print1();
		d.print2();
		d.year = 2022;
		d.month = 3;
		d.day = 9;
		d.print1();
		d.print2();
	}
}
*/
class Rectangle 
{
	int width, height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int w, int h){
		width = w;
		height = h;
	}
	
	int area() { return width*height; }
	int perimeter()	{
		return width * 2 + height * 2;
	}
}
/*
public class Act1 {
	public static void main(String[] args) 
	{
		Rectangle myRect = new Rectangle(10 ,20);
		System.out.println("면적은 " + myRect.area());
		System.out.println("둘레는 " + myRect.perimeter());
		myRect.width = 20;
		myRect.height = 40;
		System.out.println("면적은 " + myRect.area());
		System.out.println("둘레는 " + myRect.perimeter());
	}
}
*/
/*
public class Act1 {
	public static void main (String args[])  
	{ 
		Test t = new Test(); 
		MyClass newObj = t.doSomething(); 
		newObj = new MyClass(); //13번째 줄
		if(t != null)
			System.out.print(t);
		if(newObj != null)
			System.out.print(newObj);
	} 
}

class MyClass { 
	
}
class Test { 
	
	MyClass doSomething() // MyClass 객체를 반환하는 메소드
	{
		MyClass b = new MyClass(); //6번째 줄
		return null; 
	} 
}
*/


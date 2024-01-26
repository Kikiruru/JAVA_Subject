package Week11;

class Rectangle 
{
	int width, height;
	int area() { return width*height; }
}

public class Test_11 {
	public static void main(String[] args) 
	{
		Rectangle myRect = new Rectangle();
		myRect.width = 10;
		myRect.height = 20;
		/*
		Rectangle2 myRect = new Rectangle2();
		myRect.w = 10;
		myRect.h = 20;
		*/
		System.out.println("면적은 " + myRect.area());
		// System.out.println("둘레는 " + myRect.perimeter());
	}
}


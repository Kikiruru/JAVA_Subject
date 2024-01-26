package Week06;

public class Answer3 {
	public static void main(String[] args) {
		IGraphics[] arrayOfShapes = new IGraphics[3];
		
		arrayOfShapes[0] = new Rectangle(12.3, 3.4);
		arrayOfShapes[1] = new Rectangle(20.3, 5.6);
		arrayOfShapes[2] = new Circle(12.3);
		
		System.out.println("----------- Shape Draw -----------");
		for(IGraphics ig : arrayOfShapes) {
			ig.draw();
			System.out.println(ig);
			System.out.printf("둘레 : %.2f\n", ig.perimeter());
			System.out.println();
		}
	}
}

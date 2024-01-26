package Week13;

public class GenListTest {
	public static void main(String[] args) {
		GenList gl = new GenList();
		GenList gl2 = new GenList();
		GenList gl3;
		
		System.out.print("gl : ");
		gl.printGL();
		System.out.println("------------");
		gl.insertData(45);
		System.out.print("gl : ");
		gl.printGL();
		System.out.println("------------");
		gl.insertData("GenList");
		gl.insertData(45.4);
		System.out.print("gl : ");
		gl.printGL();
		System.out.println("------------");
		gl2.insertData("Seoul");
		gl2.insertData("Ganwondo");
		System.out.print("gl2 : ");
		gl2.printGL();
		System.out.println("------------");
		gl.insertData(gl2);
		System.out.print("gl : ");
		gl.printGL();
		System.out.println("------------");
		gl3 = gl.copy();
		System.out.print("gl3 : ");
		gl3.printGL();
		System.out.println("------------");
		System.out.print("gl == gl2 : ");
		System.out.print(gl.equal(gl2));
		System.out.println();
		System.out.print("gl == gl3 : ");
		System.out.print(gl.equal(gl3));
	}
}

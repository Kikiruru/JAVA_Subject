package Week06_;

public class ListTest {
	public static void main(String[] args) {
		List lt = new List();
		
		System.out.print("lt.isEmpty : ");
		System.out.println(lt.isEmpty());
		System.out.print("lt.lenth : ");
		System.out.println(lt.lenth());
		System.out.println("\n---데이터 삽입 후---\n");
		
		for(int i = 0; i < 10; i++)
			lt.insert(i, (char)(i+65));
		
		System.out.print("lt.isEmpty : ");
		System.out.println(lt.isEmpty());
		System.out.print("lt.lenth : ");
		System.out.println(lt.lenth());
		System.out.print("lt : ");
		lt.print();
		
		System.out.print("\nlt.retrieve(3) : ");
		System.out.println(lt.retrieve(3));
		System.out.println("lt.replace(3, 'X')");
		lt.replace(3, 'X');
		System.out.print("lt : ");
		lt.print();
		
		System.out.println("\nlt.replaceByElem('E', 'Z')");
		lt.replaceByElem('E', 'Z');
		System.out.print("lt : ");
		lt.print();
		
		System.out.println("\nlt.delete(5)");
		lt.delete(5);
		System.out.print("lt : ");
		lt.print();
		System.out.print("lt.lenth : ");
		System.out.println(lt.lenth());
		
		System.out.println("\nlt.deleteByElem('Z')");
		lt.deleteByElem('Z');
		System.out.print("lt : ");
		lt.print();
		System.out.print("lt.lenth : ");
		System.out.println(lt.lenth());
		
		System.out.println("\nlt.insert(4, 'W')");
		lt.insert(4, 'W');
		System.out.print("lt : ");
		lt.print();
		System.out.print("lt.lenth : ");
		System.out.println(lt.lenth());
	}
}

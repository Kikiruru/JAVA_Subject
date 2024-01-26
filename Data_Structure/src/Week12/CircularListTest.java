package Week12;

public class CircularListTest {
	public static void main(String[] args) {
		CircularList I = new CircularList();
		I.addFirst(7);
		I.print();
		I.addFirst(2);
		I.print();
		I.addLast(3);
		I.print();
		I.insert(I.listSearch(7), 5);
		I.print();
		I.insert(I.listSearch(3), 10);
		I.print();
		I.delete(I.listSearch(3));
		I.print();
		I.delete(null);
		I.print();
	}
}

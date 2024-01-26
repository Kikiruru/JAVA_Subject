package Week09;

public class LinkedList_Test {
	public static void main(String[] args) {
		LinkedList llst = new LinkedList();
		llst.addFirst("kim");
		
		System.out.println(llst.head.data);
		System.out.println(llst.length);
		System.out.println("---------------");
		
		llst.addFirst("Im");
		System.out.println(llst.head.data);
		System.out.println(llst.head.link.data);
		System.out.println(llst.length);
		System.out.println("---------------");
		
		llst.insert(llst.head, "Cho");
		System.out.println(llst.head.data);
		System.out.println(llst.head.link.data);
		System.out.println(llst.head.link.link.data);
		System.out.println(llst.length);
		System.out.println("---------------");
		
		llst.delete(llst.head);
		System.out.println(llst.head.data);
		System.out.println(llst.head.link.data);
		System.out.println(llst.length);
		System.out.println("---------------");
		
		llst.addLast("Lee");
		System.out.println(llst.head.data);
		System.out.println(llst.head.link.data);
		System.out.println(llst.head.link.link.data);
		System.out.println(llst.length);
	}
}

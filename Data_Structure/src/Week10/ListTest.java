package Week10;

public class ListTest {
	public static void main(String[] args) {
		ListNode zero = new ListNode();
		ListNode one = new ListNode();
		ListNode two = new ListNode("Two");
		ListNode three = new ListNode("Three", two);
		ListNode temp;
		LinkedList llst = new LinkedList();
		LinkedList llst2 = new LinkedList();
		ListNode Node1;
		one.putData("One");
		one.putLink(zero);
		two.putLink(one);
		System.out.println("------ListNode Test------\n");
		temp = three;
		while(temp.link != null) {
			System.out.println("Data : "+ temp.data);
			temp = temp.link;
		}
		System.out.println("-------------------------");
		System.out.println("-----LinkedList Test-----\n");
		System.out.println("<addFirst, addLast Test>");
		llst.addFirst("One");
		llst.addFirst("Two");
		llst.addLast("Three");
		llst.print();
		System.out.println("-------------------------");
		System.out.println("listSearch Test");
		Node1 = llst.listSearch("Three");
		System.out.print("Find \"Three\" Node.data : ");
		System.out.println(Node1.data);
		System.out.println("-------------------------");
		System.out.println("insert Test");
		llst.insert(Node1, "Four");
		llst.print();
		System.out.println("-------------------------");
		System.out.println("delete Test");
		llst.delete(Node1);
		llst.print();
		System.out.println("-------------------------");
		System.out.println("reverse Test");
		llst.reverse();
		llst.print();
		System.out.println("-------------------------");
		System.out.println("ConcatList Test");
		llst2.addFirst("1");
		llst2.addFirst("2");
		llst2.addFirst("3");
		llst2.print();
		llst.ConcatList(llst2);
		llst.print();
		System.out.println("-------------------------");
		System.out.println("deleteLastNode Test");
		llst.deleteLastNode();
		llst.print();
		System.out.println("-------------------------");
	}
}

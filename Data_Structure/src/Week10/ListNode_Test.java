package Week10;

public class ListNode_Test {
	public static void main(String[] args) {
		ListNode zero = new ListNode();
		ListNode one = new ListNode();
		ListNode two = new ListNode("Two");
		ListNode three = new ListNode("Three", two);
		ListNode temp;
		one.putData("One");
		one.putLink(zero);
		two.putLink(one);
		System.out.println("-----ListNode Test-----\n");
		temp = three;
		while(temp.link != null) {
			System.out.println("Data : "+ temp.data);
			temp = temp.link;
		}
		System.out.println("-----------------------");
	}
}

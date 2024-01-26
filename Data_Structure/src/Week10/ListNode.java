package Week10;

public class ListNode {
	String data;
	ListNode link;
	
	public ListNode() {
		data = null;
		link = null;
	}
	
	public ListNode(String d) {
		data = d;
		link = null;
	}
	
	public ListNode(String d, ListNode next) {
		data = d;
		link = next;
	}
	
	public void putData(String d) {
		data = d;
	}
	
	public String getData() {
		return data;
	}
	
	public void putLink(ListNode next) {
		link = next;
	}
	
	public ListNode getLink() {
		return link;
	}
}

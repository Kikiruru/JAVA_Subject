package Week11;
import Week10.*;

public class CirculerList {
	ListNode tail;
	
	public CirculerList() {
	}
	
	public void addFirst(String x) {
		ListNode newNode = new ListNode();
		newNode.putData(x); // newNode.data = x
		if(tail == null) {
			newNode.putLink(newNode); // newNode.link = newNode
			tail = newNode;
		}
		else {
			newNode.putLink(tail.getLink());// newNode.link = tail.link
			tail.putLink(newNode); //tail.link = newNode
		}
	}
	
	public void insert(ListNode p, String x) {
		ListNode newNode = new ListNode();
		newNode.putData(x); // newNode.data = x
		if(p == null) { //첫노드로 삽입
			newNode.putLink(newNode.getLink()); // newNode.link = tail.link
			tail.putLink(newNode); // tail.link = newNode
		}
		else if(tail == null) {
			newNode.putLink(newNode); //newNode.link = newNode
			tail = newNode;
		}
		else {
			newNode.putLink(p.getLink()); // newNode.link = p.link
			p.putLink(newNode); // p.link = newNode
		}
	}
	
	public void delete(ListNode p) {
		if(tail == null) { //첫 노드 삭제
			return; //빈노드
		}
		else if(p == null) { //첫 노드 삭제
			tail.putLink(tail.getLink().getLink()); //tail.link = tail.link.link
		}
		else {
			p.putLink(p.getLink().getLink()); // p.link = p.link.link
		}
	}
}
class DNode{
	String data;
	DNode llink;
	DNode rlink;
}

class DLinkedList {
	DNode first;
	
	public void delete(DNode p) {
		if(first == null || p == null)
			return;
		else {
			p.llink.rlink = p.rlink;
			p.rlink.llink = p.llink;
		}
	}
	
	public void insert(DNode p, String x) {
		DNode newNode = new DNode();
		newNode.data = x;
		if(first == null || p == null) {
			newNode.rlink = newNode;
			newNode.llink = newNode;
			first = newNode;
		}
		else {
			newNode.llink = p;
			newNode.rlink = p.rlink;
			p.rlink.llink = newNode;
			p.rlink = newNode;
		}
	}
	
	public void addFirst(String x) {
		DNode newNode = new DNode();
		newNode.data = x;
		
		if(first == null) {
			newNode.rlink = newNode;
			newNode.llink = newNode;
			first = newNode;
		}
		else {
			newNode.llink = first;
			newNode.rlink = first.rlink;
			first.llink.rlink = newNode;
			first.rlink = newNode;
		}
	}
}

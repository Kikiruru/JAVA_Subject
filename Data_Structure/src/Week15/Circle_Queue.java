package Week15;
/*
Queue(){
	int[] arr = new int[5];
	front = 0;
	rear = 0;
}
 */
public class Circle_Queue {
	int[] arr = new int[5];
	int rear = 0;
	int front = 0;
	Node first;
	Node last;
	public void enqueue(int item) {
		if ((rear+1)%5 != front) { // not full
			rear = (rear+1)%5;
			arr[rear] = item;
		}
		else // full
			return;
		/*
		if ((rear+1)%5 == front) //full
			return;
		rear = (rear+1)%5;
		arr[rear] = item;
		*/
	}
	
	public void dequeue() {
		/*
		if (front == rear) return null;
		front = (front + 1) % n;
		return arr[front];
		*/
		if (front == rear) //공백 리스트
			return;
		front = (front+1)%5;
		System.out.println(arr[front]);
		return;
	}
	
	public void insertFirst(Object x) {
		Node newNode = new Node();
		newNode.data = x;
		
		if(first == null) { //빈노드일때
			first = newNode;
			last = newNode;
		}
		else {
			newNode.rlink = first;
			newNode.llink = null;
			first.llink = newNode;
			first = newNode;
		}
	}
	
	public void removeFirst() {
		if (first == null) return;
		if (first == last) // 원소가 1개
		{
			first = null;
			last = null;
		}
		if (first.rlink == last)
			first = last;
		
		first = first.rlink;
		last.rlink = first;
		first.llink = last;
	}
	/*
	insertFirst(x){
		Node newNode = new Node(); newNode
		if (first == null) { data = x;
		 	first = newNode;
		 	last = newNode;
		 }
		 else {
		 	newNode.rlink = first
		 	newNode.llink = null;
		 	first.llink = newNode;
		 	first = newNode;
		 }	
	}
	 */
	/*
	public void insertFirst (Object x) {
		Node newNode = new Node();
		newNode.data = x;
		newNode.rlink = first.rlink;
		newNode.llink = first;
		first.rlink.llink = newNode;
		first.rlink = newNode;
	}
	 */
}

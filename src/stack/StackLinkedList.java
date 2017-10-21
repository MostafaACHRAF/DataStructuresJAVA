package stack;

public class StackLinkedList<T> {

	Node head;
	
	public StackLinkedList() {
		head = null;
	}
	
	public void push(T value) {
		Node newItem = new Node(value, null);
		
		if(head == null) {
			head = newItem;
		} else {
			newItem.next = head;
			head = newItem;
		}
	}
	
	public T pop() {
		if (head == null) {
			System.out.println("Stack is empty !");
			return null;
		}
		
	    T val = (T) head.next;
		
		head = head.next;
		
		return val;
	}
	
	
	public void display() {
		Node n = head;
		
		while (n != null) {
			System.out.println(n.value);
			n = n.next;
		}
		
	}
	
}

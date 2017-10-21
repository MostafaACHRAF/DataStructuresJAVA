package stack;

public class Node<T> {

	Object value;
	Node next;
	
	public Node(T value, Node next) {
		this.value = value;
		this.next = next;
	}
}

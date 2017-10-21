package QueueArray;

public class QueueArray<T> {

	public Object[] tab;
	public int rear;
	public int front;
	
	public QueueArray(int size) {
		tab = new Object[size];
		front = -1;
		rear = -1;
	}
	
	public void queue(T value) {
		
		if (isFull()) {
			System.out.println("You can't add items. Fifo Full !");
			return;
		}
		rear++;
		tab[rear] = value;
		if(front == -1)
			front = 0;
	}
	
	public boolean isFull() {
		return front == tab.length - 1;
	}
	
	public boolean isEmpty() {
		return front == -1 || front > rear;
	}
	
	public T dequeue() {
		if (isEmpty()) {
			System.out.println("You can't delete items. Fifo empty !");
			return null;
		}
		
		T deletedItem = (T) tab[front];
		front++;
		return deletedItem;
	}
	
}

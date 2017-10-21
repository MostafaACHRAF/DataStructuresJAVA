package QueueArray;

public class QueueArrayImpl {

	public static void main(String[] args) {
		
		QueueArray<Integer> tab = new QueueArray<Integer>(5);
		
		tab.queue(5);
		tab.queue(6);
		tab.queue(7);
		
		System.out.println(tab.dequeue() + " " + tab.dequeue());
		
	}

}

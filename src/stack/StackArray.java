package stack;

public class StackArray<T> {
	
	public Object[] stackArray;
	public int size;
	public int top;

	public StackArray(int size) {
		this.top = -1;
		this.size = size;
		stackArray = new Object[this.size];
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push (int value) {
		if (!isFull()) {
			stackArray[++top] = value;
		}
	}
	
	public T pop() {
		if(isEmpty())
			return null;
		T val = (T) stackArray[top];
		top--;
		return val;
	}

}

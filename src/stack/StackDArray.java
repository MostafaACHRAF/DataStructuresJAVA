package stack;

import java.util.Arrays;

public class StackDArray<T> {

	public Object[] stackDArray;
	public int size;
	public int top;

	public StackDArray(int size) {
		this.top = -1;
		this.size = size;
		stackDArray = new Object[this.size];
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push (int value) {
		ensureCapacity(top + 2);
		top = top + 1;
		stackDArray[top] = value;
	}
	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			stackDArray = Arrays.copyOf(stackDArray, newCapacity);
		}
	}
	
	public T pop() {
		if(isEmpty())
			return null;
		T val = (T) stackDArray[top];
		top--;
		return val;
	}
	
	public int getSize() {
		return stackDArray.length;
	}
	
}

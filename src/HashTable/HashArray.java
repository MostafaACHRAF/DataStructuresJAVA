package HashTable;

public class HashArray<T> {
	
	public HashElement[] hashArray;
	public int size;
	

	public HashArray(int size) {
		this.size = size;
		hashArray = new HashElement[size];
		for (int i = 0; i < size; i++) {
			hashArray[i] = new HashElement();
		}
	}
	
	public int getHash(int key) {
		return key % size;
	}
	
	public void put(int key, T value) {
		HashElement newItem = new HashElement(key, value);
		HashElement targetHashElement = hashArray[getHash(key)];
		newItem.next = targetHashElement.next;
		targetHashElement.next = newItem;
		
	}
	
	public T get(int key) {
		T value = null;
		HashElement item = hashArray[getHash(key)];
		
		while(item != null) {
			if(item.key == key) {
				value = (T) item.value;
				break;
			}
			item = item.next;
		}
		
		return value;
	}

}

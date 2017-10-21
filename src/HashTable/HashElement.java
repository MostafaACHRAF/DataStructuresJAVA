package HashTable;

public class HashElement {
	
	public int key;
	public Object value;
	public HashElement next;

	public HashElement(int key, Object value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public HashElement() {
		this.next = null;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public Object getValue() {
		return this.value;
	}

}

package HashTable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		HashArray<String> hashTable = new HashArray<String>(5);
		
		hashTable.put(11, "mostafa");
		hashTable.put(10, "achraf");
		hashTable.put(5, "fatima");
		
		System.out.println(hashTable.get(10));
	}

}

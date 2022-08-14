package dsImplementaion.hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		MyHashTable<String> myHashTable=new MyHashTable<>(5);
		myHashTable.put(1,"Hello");
		myHashTable.put(2,"good");
		myHashTable.put(3,"morning");
		System.out.println(myHashTable.getValue(1)+"  "+myHashTable.getValue(2));
	}

}

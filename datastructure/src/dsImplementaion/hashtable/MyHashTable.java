package dsImplementaion.hashtable;

public class MyHashTable<T> {
	
	Entry entryArray[];
	int size;
	
	public MyHashTable(int size) {
		this.size=size;
		entryArray=new Entry[size];
		for(int i=0;i<size;i++) {
			entryArray[i]=new Entry();
		}
	}
	
	public int getHashIndex(int key) {
		return key%size;
	}
	
	public void put(int key,Object value) {
		int hashIndex=getHashIndex(key);
		Entry arrayValue=entryArray[hashIndex];
		Entry newItem=new Entry(key, value);
		newItem.next=arrayValue.next;
		arrayValue.next=newItem;
	}
	
	@SuppressWarnings("unchecked")
	public T getValue(int key) {
		T value=null;
		Entry entry=entryArray[getHashIndex(key)];
		while(entry!=null) {
			if(entry.getKey()==key) {
				value=(T)entry.getValue();
				break;
			}
			entry=entry.next;
		}
		return value;
	}

}

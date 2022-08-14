package dsImplementaion.hashtable;

public class Entry {
	
	int key;
	Object value;
	Entry next;
	
	Entry(int key,Object value){
		this.key=key;
		this.value=value;
		next=null;
	}
	
	Entry(){
		next=null;
	}
	
	public int getKey() {
		return key;
	}

	public Object getValue() {
		return value;
	}

	

}

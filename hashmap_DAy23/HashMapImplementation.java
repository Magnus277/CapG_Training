package hashmap_DAy23;

public class HashMapImplementation {
	final int size=16;
	Entry[] buckets=new Entry[size];
	
	private int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;
	}
	
	public void put(int key,int value) {
		int index=getBucketIndex(key);
		
		System.out.println("The entry is added at index: "+index);
		
		Entry current=buckets[index];
		
		if(current!=null) {
			if(current.key==key) {
				current.value=value;
				return;
			}
			current=current.next;
		}
		
		Entry node=new Entry(key,value);
		node.next=buckets[index];
		buckets[index]=node;
	}
	
	public Integer getValue(int key) {
		int index=getBucketIndex(key);
		Entry current=buckets[index];
		
		while(current!=null) {
			if(current.key==key) {
				return current.value;
			}
			current=current.next;
		}
		throw new RuntimeException("Key "+key+" not found!");
	}
	
	public void delete(int key) {
	    int index = getBucketIndex(key);
	    Entry current = buckets[index];
	    Entry prev = null;

	    while (current != null) {
	        if (current.key == key) {
	            if (prev == null) {
	                // Deleting the head of the list
	            	prev=current;
	                buckets[index] = current.next;
	                prev.next=null;
	            } else {
	                // Bypass the current node
	            	
	                prev.next = current.next;
	            }
	            System.out.println("Key " + key + " deleted.");
	            return;
	        }
	        prev = current;
	        current = current.next;
	    }
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			Entry current=buckets[i];
			
			if(current!=null) {
				System.out.println("Bucket "+i+": ");
				while(current!=null) {
					System.out.println("["+current.key+" => "+current.value+"]");
					current=current.next;
				}
				System.out.println();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		HashMapImplementation map=new HashMapImplementation();
		map.put(10,1);
		map.put(10,8);
		map.put(20,9);
		map.put(30,7);
		map.display();
		
		System.out.println(map.getValue(10));
	}
}

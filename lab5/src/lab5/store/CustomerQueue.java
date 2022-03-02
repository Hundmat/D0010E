package lab5.store;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CustomerQueue {
    private ArrayList<Customer> customerQueue = new ArrayList<Customer>();
	private int maxCounter = 0;
	
	
	public void add(Customer customer) {
		customerQueue.add(customer);
		if (customerQueue.size() > maxCounter) {
			maxCounter = customerQueue.size();
		}
	}
	
	
	public void removeFirst() {
		customerQueue.remove(first());
	}
	
	
	public Object first()  throws NoSuchElementException  {
		//OM ELEMENTET INTE FINNS, THROW
		if (customerQueue.isEmpty()) {
			throw new NoSuchElementException();
		}
		Object first = customerQueue.get(0);
		return first;	
	}
	
	
	public int maxSize() {
		return this.maxCounter;
	}
	
	
	public boolean isEmpty() {
		if (customerQueue.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int size() {
		return customerQueue.size();
	}
	
	
	public String toString() {
		String långSträng = "Queue: ";
		for(Object elem : this.customerQueue){
		långSträng += "(" + String.valueOf(elem) + ") ";
		}
		return långSträng;
	}
}

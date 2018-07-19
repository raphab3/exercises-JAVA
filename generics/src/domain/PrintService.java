package domain;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> list = new ArrayList<>();

	public void addList(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		if(!list.isEmpty()) {
			System.out.println(list);
		}
	}
}

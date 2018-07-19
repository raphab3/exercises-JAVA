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
	
	
	public Integer max(List<Integer> lista) {
		Integer max = lista.get(0);
		for(Integer item : lista) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
	public void print() {
		if(!list.isEmpty()) {
			System.out.println(list);
		}
	}
}

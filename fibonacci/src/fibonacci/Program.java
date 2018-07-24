package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		
//		Stream<Long> sp = Stream.iterate(new Long[] {0L , 1L}, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
//		System.out.println(Arrays.toString(sp.limit(20).toArray()));
//		
		
		List<Integer> list = new ArrayList<>();
		
		int n = 20;
		int ante = 0;
		int atual = 1;
		
		
		list.add(ante);
		list.add(atual);
		
		
		for(int i=1; i<=n; i++ ) {
			
			int prox = atual + ante;
			list.add(prox);
			ante = atual;
			atual = prox;
			
			
		}
		System.out.println(list);
		System.out.println("Na posição: " + ""+n+" " + list.get(list.size() - 1));
		
	}

}

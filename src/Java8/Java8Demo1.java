package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

//class consImpl implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println(t);
//		
//	}
//	
//}

public class Java8Demo1 {
	
	
	public static void main(String[] args) {
		
		//List<Integer> values = Arrays.asList(1,3,5,7,8,10);
		List<Integer> values = Arrays.asList(12,20,35,46,68,75);
		
		/*Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		};*/
		
//		Consumer<Integer>  c =  i -> System.out.println(i);
//		
//		values.forEach(c);
//				
//		values.forEach(i -> System.out.println(i));
//		
		
		//System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e)-> c+e));

		/*Function<Integer, Integer> f = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				
				return t*2;
			}
			
		};*/
		
		/*BinaryOperator<Integer>  b = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
			
		};
		*/
		Stream<Integer> s = values.stream();
		//Stream<Integer> s1 = s.map(t->t*2);
				
		Integer result=  values.stream().map(t->t*2).reduce(0, (t,u)->t+u);
		System.out.println(values.stream().map(t->t*2).reduce(0, (t,u)->t+u));
		System.out.println(values.stream().map(t->t*2).reduce(0, (t,u)->Integer.sum(t, u)));
		System.out.println(values.stream().map(t->t*2).reduce(0, Integer::sum));
		//Sum using Integer class
		
		
		
		
		
	}

}

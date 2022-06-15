package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		ABC abc = new ABC();
		//aproach 1
		list.stream().forEach(abc);

		//approach 2
		list.stream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}

		});
		//approach 3
		list.stream().forEach((t -> {
            System.out.println(t);
        })); 

	}

}

class ABC implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);

	}

}

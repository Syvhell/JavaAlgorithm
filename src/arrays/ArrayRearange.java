package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayRearange {
	


	public static void main(String[] args) {
	
		List<Integer> A = new ArrayList<>();
		A.add(26);
		A.add(2);
		A.add(23);
		A.add(12);
		A.add(20);
		
		for(int i = 0; i <= 2; i++) {
			Integer value = A.get(i);
			System.out.println(value);
			for(int j = i; j <= i ;j++) {
				List<Integer> B = new ArrayList<>();
				if(i >= B.size()) {
					B.add(A.get(i));
					System.out.println(B);
				}
				
			}
		};
	}


}

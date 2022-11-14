package task;

public class Task05 {

	public static void main(String[] args) {
		
//		별 찍기 5)
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (4 - i) * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * i	i < 5	j	???	k	???
		 * ---------------------------------
		 * 0	T		0	T				j는 4 - i와 같을 때 F, 작을 때 T
		 * 				4	F	0	T		j < 4 - i
		 * 						1	F		
		 * 1	T		0	T				k는 i * 2 + 1보다 작을 때 T
		 * 				3	F	0	T		k < i * 2 + 1
		 * 						2	T
		 * 						3	F		
		 * 2	T		0	T				
		 * 				1	T
		 * 				2	F	0	T		
		 * 						4	T
		 * 						5	F
		 * 
		 * ---------------------------------
		 * 
		 * 0	T		0	T				i = 0	j = 0	k <= 6
		 * 				1	F	0	T		j는 i와 작거나 같을 때 T
		 * 						6	T		j <= i
		 * 						7	F		
		 * 1	T		0	T				
		 * 				1	T
		 * 				2	F	0	T		k는 (4 - i) * 2 - 1 보다 작을 때 T
		 * 						4	T		k < (4 - i) * 2 - 1
		 * 						5	F		
		 * 3	T		0	T				
		 * 				3	T
		 * 				4	F	0	T
		 * 						1	F
		 * 				
		*/
		
		

	}

}

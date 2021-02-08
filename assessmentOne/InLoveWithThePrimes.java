// Correct answer
package assessmentOne;
import java.util.*;
public class InLoveWithThePrimes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=0;t<T;t++) {
			int n = scan.nextInt();
			ArrayList<Integer> array = new ArrayList<>();
			
			int flag = 1;
			for (int i = 1; i <= n; i = i + 2) {
				 
		        // flag variable to tell
		        // if i is prime or not
		         flag = 1;
		 
		        // WE TRAVERSE TILL SQUARE ROOT OF j only.
		        // (LARGEST POSSIBLE VALUE OF A PRIME FACTOR)
		        for (int j = 2; j * j <= i; ++j) {
		            if (i % j == 0) {
		                flag = 0;
		                break;
		            }
		        }
		 
		        // flag = 1 means i is prime
		        // and flag = 0 means i is not prime
		        if (flag == 1) {
		        	 array.add(i);
				      //System.out.println(i);
		        }
		    }
			array.add(2);
			array.remove(0);
			
			
			boolean flag1 = false;
			for(int m=0;m<array.size();m++) {
				for(int k=0;k<array.size();k++) {
					if(array.get(m) + array.get(k) == n) {
						flag1 = true;
						break;
					}
				}
			}
			if(flag1 == true) {
				System.out.println("Deepa");
			}else {
				System.out.println("Arjit");
			}
			
		}
	}

}

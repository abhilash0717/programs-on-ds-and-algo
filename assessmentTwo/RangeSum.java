//TLE
package assessmentTwo;
import java.util.*;
public class RangeSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=0;t<T;t++) {
			long n = scan.nextLong();
			
			long[] array = new long[(int) n+1];
			for(int z=0;z<n;z++) array[z] = scan.nextLong();
			
			long q = scan.nextLong();
			for(int x = 0; x<q;x++) {
				long l  = scan.nextLong();
				long r = scan.nextLong();
				
				long total = 0;
				for(long i= l-1; i<r;i++) {
					total = total + array[(int) i];
					//System.out.println(array[(int) i]);
				}
				System.out.println(total);
			}
		}

	}

}

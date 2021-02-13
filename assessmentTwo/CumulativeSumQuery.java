//AC
package assessmentTwo;
import java.util.*;
public class CumulativeSumQuery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long[] array = new long[(int) n+1];
		for(int z=0;z<n;z++) array[z] = scan.nextLong();
		long q = scan.nextLong();
		for(int x=0;x<q;x++) {
			long l = scan.nextLong();
			long r = scan.nextLong();
			
			long total = 0;
			for(long i = l;i<=r;i++) {
				total = total + array[(int) i];
			}
			
			System.out.println(total);
		}

	}

}

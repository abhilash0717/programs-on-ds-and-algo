//Wrong answer

package assessmentOne;
import java.util.*;
public class RyotsuLovesPrimes {

	static boolean isPrime(long num) {
		boolean flag = true;
		for(int j=2;j<=num/2;j++)
		{
	       long temp = num % j;
		   if(temp==0)
		   {
		      flag = false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(flag)
		   return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=0;t<T;t++) {
			long n = scan.nextLong();
			int k = scan.nextInt();
			
			long[] array = new long[(int) n];
			for(int z=0;z<n;z++) array[z] = scan.nextLong();
			
			ArrayList<Long> primes = new ArrayList<>();
			int count = 0;
			long total = 0;
			for(int i=0;i<array.length;i++) {
				boolean ans = isPrime(array[i]);
				if(ans) {
					primes.add(array[i]);
					//System.out.println(array[i]);
				}
			}
			
			for(int a = 0;a<primes.size();a = a + k) {
				if(a != 0) {
					total = total + primes.get(a);
				}
			}
			System.out.println(total);
		}
	}

}

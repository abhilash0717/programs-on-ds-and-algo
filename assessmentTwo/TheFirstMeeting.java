//TLE
package assessmentTwo;
import java.util.*;
public class TheFirstMeeting {
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
		long n = scan.nextLong();
		long[] array = new long[(int) n];
		for(int x=0;x<n;x++) array[x] = scan.nextLong();
		
		long min = Integer.MAX_VALUE, max = 0;
		boolean flag =  false;
		for(long i=0;i<n;i++) {
			flag = isPrime(array[(int) i]);
			if(flag && array[(int) i] != 1) {
				if(array[(int) i] > max) {
					max = array[(int) i];
				}
				
				if(array[(int) i] < min) {
					min = array[(int) i];
				}
			}
		}
		System.out.println(max - min);
	}

}

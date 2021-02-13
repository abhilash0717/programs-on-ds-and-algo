//TLE
package assessmentTwo;
import java.util.*;
public class UltraPrime {
	
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
		long T = scan.nextLong();
		for(int t=0;t<T;t++) {
			long l = scan.nextLong();
			long r = scan.nextLong();
			
			boolean flag = false, flag1 = false;
			long count = 0;
			for(long i = l; i<= r ; i++) {
				flag = isPrime(i);
				if(flag && i != 1 && i != 0) {
					//System.out.println(i);
					long temp = i,total = 0;
					while(temp != 0) {
						long q = temp % 10;
						total += q;
						temp /= 10;
					}
					
					flag1 = isPrime(total);
					if(flag1) {
						count++;
					}
				}
				
			}
			System.out.println(count);
		}

	}

}

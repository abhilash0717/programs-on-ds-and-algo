package assessmentThree;
import java.util.*;
public class SumOfPrimes {

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
		long num  = scan.nextLong();
		boolean flag = false;
		
		long total = 0;
		for(int i=2;i<=num;i++) {
			flag = isPrime(i);
			if(flag) {
				total += i;
			}
		}
		
		System.out.println(total);
	}

}

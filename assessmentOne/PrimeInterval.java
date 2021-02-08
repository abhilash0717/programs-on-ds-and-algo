//Correct answer
package assessmentOne;
import java.util.*;
public class PrimeInterval {

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
		long l = scan.nextLong();
		long r = scan.nextLong();
		
		for(long i=l ; i<= r;i++) {
			boolean flag1 = isPrime(i);
			if(flag1 && i!=1){
				System.out.print(i +" ");
			}
		}

	}

}

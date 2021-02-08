package assessmentOne;
import java.util.*;
public class MicroAndPrimePrime {
	
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

	static boolean newmain(long n) {
		long count = 0;
		for(int j = 1; j<= n ;j++) {
			boolean flag1 = isPrime(j);
			if(flag1 && j!=1){
				count++;
			}
		}
		
		boolean anotherFlag = isPrime(count);
		if(anotherFlag) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=0;t<T;t++) {
			long l = scan.nextLong();
			long r = scan.nextLong();
			
			long ans = 0;
			for(long i=l;i<=r;i++) {
				boolean flag = newmain(i);
				if(flag) {
					ans++;
				}
			}
			
			System.out.println(ans);
		}
		

	}

}

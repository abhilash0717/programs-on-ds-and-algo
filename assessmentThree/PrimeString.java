//Correct answer
package assessmentThree;
import java.util.*;
public class PrimeString {
	
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
			String s = scan.next();
			
			HashMap<Character, Integer> map = new HashMap<>();
			for(int i=0;i<s.length();i++) {
				if(!map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), 1);
				}else {
					map.put(s.charAt(i), map.get(s.charAt(i))+1);
				}
			}
			
			int count = 0;
			for(Map.Entry<Character, Integer> entry : map.entrySet()) {
				boolean flag  = isPrime(entry.getValue());
				
				if(flag && entry.getValue() != 1 && entry.getValue() != 0) {
					count++;
				}
			}
			
			boolean len = isPrime(map.size());
			if(count == map.size() && len) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}

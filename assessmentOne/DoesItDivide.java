//Wrong answer
package assessmentOne;
import java.util.*;
public class DoesItDivide {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=0;t<T;t++) {
			long num = scan.nextLong();
			
			long p = 1, s = 0;
			for(int i=1;i<= num; i++) {
				p = p * i;
				s = s + i;
			}
			
			if(p%s == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}

}

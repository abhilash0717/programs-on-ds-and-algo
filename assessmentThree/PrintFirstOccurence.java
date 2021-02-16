//ACCEPTED
package assessmentThree;
import java.util.*;
public class PrintFirstOccurence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long T = scan.nextLong();
		for(long t=0;t<T;t++) {
			String s = scan.next();
			
			String ans = "";
			ArrayList<Character> array = new ArrayList<>();
			for(int i=0;i<s.length();i++) {
				if(!array.contains(s.charAt(i))) {
					array.add(s.charAt(i));
					ans += s.charAt(i);
				}
			}
			System.out.println(ans);
			
		}

	}

}

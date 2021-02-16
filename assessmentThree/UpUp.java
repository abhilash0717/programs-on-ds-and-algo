//ACCEPTED
package assessmentThree;
import java.util.*;
public class UpUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		char[] array = str.toCharArray();
		for(int i=1;i<array.length;i++) {
			if(array[i - 1] == ' ') {
				array[i] = Character.toUpperCase(array[i]);
			}
		}
		
		array[0] = Character.toUpperCase(array[0]);
		String ans = "";
		for(int j=0;j<array.length;j++) {
			ans += array[j];
		}
		
		System.out.println(ans);
	}

}

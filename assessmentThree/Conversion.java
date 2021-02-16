//ACCEPTED
package assessmentThree;
import java.util.*;
public class Conversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long Test = scan.nextLong();
		scan.nextLine();
		for(long start =0 ;start<Test;start++) {
			String str = scan.nextLine();
			
			HashMap<Character, Integer> smallmap = new HashMap<>();
			HashMap<Character, Integer> largemap = new HashMap<>();
			
			smallmap.put('a', 1);
			smallmap.put('b', 2);
			smallmap.put('c', 3);
			smallmap.put('d', 4);
			smallmap.put('e', 5);
			smallmap.put('f', 6);
			smallmap.put('g', 7);
			smallmap.put('h', 8);
			smallmap.put('i', 9);
			smallmap.put('j', 10);
			smallmap.put('k', 11);
			smallmap.put('l', 12);
			smallmap.put('m', 13);
			smallmap.put('n', 14);
			smallmap.put('o', 15);
			smallmap.put('p', 16);
			smallmap.put('q', 17);
			smallmap.put('r', 18);
			smallmap.put('s', 19);
			smallmap.put('t', 20);
			smallmap.put('u', 21);
			smallmap.put('v', 22);
			smallmap.put('w', 23);
			smallmap.put('x', 24);
			smallmap.put('y', 25);
			smallmap.put('z', 26);
			
			smallmap.put('A', 1);
			smallmap.put('B', 2);
			smallmap.put('C', 3);
			smallmap.put('D', 4);
			smallmap.put('E', 5);
			smallmap.put('F', 6);
			smallmap.put('G', 7);
			smallmap.put('H', 8);
			smallmap.put('I', 9);
			smallmap.put('J', 10);
			smallmap.put('K', 11);
			smallmap.put('L', 12);
			smallmap.put('M', 13);
			smallmap.put('N', 14);
			smallmap.put('O', 15);
			smallmap.put('P', 16);
			smallmap.put('Q', 17);
			smallmap.put('R', 18);
			smallmap.put('S', 19);
			smallmap.put('T', 20);
			smallmap.put('U', 21);
			smallmap.put('V', 22);
			smallmap.put('W', 23);
			smallmap.put('X', 24);
			smallmap.put('Y', 25);
			smallmap.put('Z', 26);
			
			
			String ans = "";
			for(int st = 0; st<str.length();st++) {
				if(smallmap.containsKey(str.charAt(st))) {
					ans += Integer.toString(smallmap.get(str.charAt(st)));
					//System.out.println(ans);
				}
			/*	
				if(largemap.containsKey(st)) {
					ans+= largemap.get(st);
				}
				*/
				if(str.charAt(st) == ' ') {
					ans += '$';
				}
			}
			
			System.out.println(ans);
			
			
		}

	}

}

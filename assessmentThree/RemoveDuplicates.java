package assessmentThree;

//ACCEPTED

import java.util.*;
class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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

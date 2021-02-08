//TLe
package assessmentOne;
import java.util.*;
 class RoyAndShopping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=0;t<T;t++) {
			int n = scan.nextInt();
			
			int[] seive = new int[n+1];

            for(int k = 2; k<= n; k++){
                seive[k] = 1;
            }
            
           seive[0] = seive[1] = 0;
            
            for(int i=2;i*i <= n; i++){
                if(seive[i] == 1){
                    for(int j=i*i; j<= n;j = j+i){
                        seive[j] = 0;
                    }
                }
            }
			
            int min = Integer.MAX_VALUE;
			for(int m = 0; m<seive.length;m++) {
				if(seive[m] != 0 && n%m == 0) {
					if(m < min) {
						min = m;
					}
				}
			}
		
			System.out.println(n - min);
		}

	}

}
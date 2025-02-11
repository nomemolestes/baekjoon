package bakjoon_;
import java.util.Scanner;

public class p_no_2675 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 2
        
        for(int i = 0; i < T; i++) { //2번 가능
        	int R = sc.nextInt(); // 3,, 5
        	String S = sc.next(); // abc,, /htp
        	String result = "";

        	for(int x =0; x < S.length(); x++) { //3번반복
        		for(int y=0; y < R; y++) {
       				result += S.charAt(x);
        		}
        	}
        	System.out.println(result);
        }							
	 }
}

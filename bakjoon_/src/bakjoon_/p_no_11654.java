package bakjoon_;
import java.util.Scanner;

public class p_no_11654 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String numbers = sc.next();
        int result = 0;
        int resultChk = 0;
        for (int i = 0; i < N; i++) {
            	result += numbers.charAt(i)-'0'; //아스키코드값을 반환하므로 -48('0')을 해줌
//            	System.out.println("res :::::"+result);
            	if(i == N-1) {
            		resultChk = result;
            	}
        }
        System.out.println(resultChk);
	}
}

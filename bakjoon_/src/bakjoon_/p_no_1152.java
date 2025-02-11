package bakjoon_;
import java.util.Scanner;

public class p_no_1152 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(); //문자열 입력받음
        String str = S.trim(); //문자열 공백제거함 앞뒤
        String[] arr = str.split(" "); //쪼갬
        if("".equals(str)) { //공백만 입력햇을떄
        	System.out.println(0);
        } else {
        	System.out.println(arr.length);
        }
      					
	 }
}

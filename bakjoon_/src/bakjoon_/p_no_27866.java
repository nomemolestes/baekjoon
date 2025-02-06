package bakjoon_;
import java.util.Arrays;
import java.util.Scanner;

public class p_no_27866 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자 S가 주어지고 정수 i가 주어졌을때 i번째 글자 출력
		String S = sc.nextLine();
		int i = sc.nextInt();
		String[] arr = S.split("");//문자열 쪼개서 배열에 담아서 for문을 돌리고 i번째 출력
		System.out.println(Arrays.toString(arr));
		for(int x=0; x <= arr.length; x++) {
			if(x == i-1) {
				System.out.println(arr[x]);
			}
			else {
				continue;
			}
		}
	}
}

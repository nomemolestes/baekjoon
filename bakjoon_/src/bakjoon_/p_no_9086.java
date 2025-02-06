package bakjoon_;
import java.util.*;

public class p_no_9086 {
	 public static void main(String[] args) {
		 //첫번째와 끝, 1개면 2번, 2개면 모두...
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<String> newList = new ArrayList<>();
		for(int i = 0; i <= T; i++) { //숫자만큼 돌림
			String ATOZ = sc.nextLine(); //문자열들 입력
			String[] arr = ATOZ.split(""); //문자열 나눠서 배열에 담기
			if(i==0) {
				continue;
			} else {
				newList.add(arr[0]+arr[arr.length-1]);
			}
		}
		for(int x=0; x < newList.size(); x++) {
			System.out.println(newList.get(x));
		}
	 }
}

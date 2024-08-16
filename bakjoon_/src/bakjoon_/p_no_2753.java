package bakjoon_;

import java.util.Scanner;

public class p_no_2753 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		if(A%4 == 0 && !(A%100==0) || A%400 ==0) { //윤년 연도가 4의 배수이면서 400의 배수일 때이다.
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}

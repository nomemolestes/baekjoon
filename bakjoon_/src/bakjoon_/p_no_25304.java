package bakjoon_;

import java.util.Scanner;

public class p_no_25304 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in); //숫자 입력받는 스캐너
			/*
			 * 첫째 줄에는 영수증에 적힌 총 금액 $X$가 주어진다.
			둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 $N$이 주어진다.
			이후 $N$개의 줄에는 각 물건의 가격 $a$와 개수 $b$가 공백을 사이에 두고 주어진다.
			 */
	    	int X = in.nextInt(); // 영수증 총합 금액
	    	int N = in.nextInt(); // 몇개삿나
	    	int pr = 0;
	    	for(int i=0; i < N; i++) {
	    		int a = in.nextInt(); //해당물건 가격
	    		int b = in.nextInt(); //해당물건 갯수
	    		pr += a * b; // 이전 for문에서의 연산(곱)의 값을 다음 연산(곱)과 더함 !!
	    	}
	    	if(X == pr) {
	    		System.out.println("Yes");
	    	} else {
	    		System.out.println("No");
	    	}
	    	
	    }
}


package bakjoon_;

import java.util.Scanner;

public class p_no_2739 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in); //숫자 입력받는 스캐너
	    	int N = in.nextInt();
	    	//구구단 문제
	    	for(int i = 1; i <= 9; i++) { // idx 1~9까지 반복문, 1씩 증가
	    		//2 * 1 = 2
	    		System.out.println(N+" * "+i+" = "+N*i); //2 * 1 = 2
	    	}
	    	

	    }
}


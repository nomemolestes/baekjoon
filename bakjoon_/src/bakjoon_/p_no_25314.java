package bakjoon_;

import java.util.Scanner;

public class p_no_25314 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in); //숫자 입력받는 스캐너
	    	int N = in.nextInt(); // N은 4의배수
	    	int a = N/4;
	    	for(int i = 0; i < a; i++) {
	    		System.out.print("long ");
	    	}
	    	System.out.print("int");
	    }
}


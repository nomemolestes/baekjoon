package bakjoon_;

import java.util.Scanner;

public class p_no_10871 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in); //숫자 입력받는 스캐너
	    	int N = in.nextInt(); // 배열 길이
	    	int X = in.nextInt(); // 입력한 수
	    	int[] A = new int [N];
	    	for(int i =0; i < N; i++) { 
	    		int a = in.nextInt(); //배열 담기
	    		A[i]= a;
	    	}
//	    	System.out.println("A.LENGTH : "+A.length);
	    	for(int x =0; x < A.length; x++) {
	    		if(A[x] < X) { //입력한 수보다 작은 숫자들은 출력
	    			System.out.print(A[x]+" "); //공백과 함께
	    		}
	    	}
	    }
}


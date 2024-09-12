package bakjoon_;

import java.util.ArrayList;
import java.util.Scanner;

public class p_no_10807 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in); //숫자 입력받는 스캐너
	    	int N = in.nextInt(); // 11
	    	int[] arr = new int[N];
	    	for(int i=0; i < N; i++) {
	    		 //입력숫자 1 2 ... 4 4
	    		int b = in.nextInt();
	    		arr[i] = b;
	    	}
	    //	System.out.println("배열 :: "+arr[1]); //잘 담겻음,
//	    	length : 배열의 길이 알려 할 때
//	    	length() : 문자열의 길이를 알려 할 때 공백포함
//	    	size() : Collection, 자료구조의 크기를 알려 할 때
	    	
	    	int v = in.nextInt(); //비교하려는 숫자
	    	int sum = 0;
	    	for(int x=0; x < arr.length; x++) { //담은 배열을 반복문을 돌려
	    		if(arr[x] == v) { // 배열에 담긴 수들과 비교하려는 수가 같다면...
	    			sum += 1 ; // sum 올라감
//	    			System.out.println("sum : "+sum);
	    		}
	    	}
	    	System.out.println(sum);
	    }
}


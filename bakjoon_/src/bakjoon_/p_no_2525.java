package bakjoon_;

import java.util.Scanner;

public class p_no_2525 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in); //숫자 입력받는 스캐너
	    	int hr = in.nextInt(); //현재 시 HOUR
	    	int mn = in.nextInt(); //현재 분 MIN
	    	int pr = in.nextInt(); //소요시간
	    	//23 48, 25:: 0 13 ::::::: 시를 먼저 분으로 바꿔서 계산 !
	    	hr = hr*60; //모두 분으로 변환 14*60
//	    	System.out.println("hr : "+hr);
	    	int A = hr + mn + pr;
//	    	System.out.println("A : "+A);
	    	hr = (A/60)%24;
//	    	System.out.println("hrhr : "+hr);
	    	mn = A%60;
//	    	System.out.println("mn : "+mn);
	    	System.out.println(hr+" "+mn);
	    }
}


package bakjoon_;

import java.util.Scanner;

public class p_no_2480 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in); //숫자 입력받는 스캐너
	    	int a = in.nextInt();
	    	int b = in.nextInt();
	    	int c = in.nextInt();
//	    	같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
	    	if(a==b && a==c) {
		    	System.out.println(10000+(a*1000));
		    }else if(a==b || b==c || a==c) { //3 3 6 1300
	    		if(a == b) {//3 3 6
	    			System.out.println(1000+(a*100));
	    		} else if(a == c) { //3 6 3
	    			System.out.println(1000+(c*100));
	    		} else if(b == c) { //6 3 3
	    			System.out.println(1000+(b*100));
	    		}
	    	} else { //6 2 5 모두 다른눈임
//	    		System.out.println("cccc"+c);
	    		if(a > b) {
	    			if(a > c) {
	    				System.out.println(a*100);
	    			} else { // a > b && a <= c
    					System.out.println(c*100);
	    			}
	    		} else { //a <= b
	    	//		System.out.println("bbb"+b);
	    			if(b < c) {
	    				System.out.println(c*100);
	    			} else { // a <= b b >= c
	    				System.out.println(b*100);
	    			}
	    		}
	    		}
	    }
}


package bakjoon_;

import java.util.Scanner;

public class p_no_2884 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in); //숫자 입력받는 스캐너
	    	int H = in.nextInt(); //시 HOUR
	    	int M = in.nextInt(); //분 MIN
	    	//0 30 = 12 30
	    	if(M-45 < 0) { //m=-35 absNo 35
	    		H = H-1; //h 9
	    		M = 60-45+M;
	    		if(H < 0) {
	    			H = 24+H;
	    		}
	    	} else {
	    		M = M-45;
	    	}
	    	System.out.println(H+" "+M);
	    	
	    }
}


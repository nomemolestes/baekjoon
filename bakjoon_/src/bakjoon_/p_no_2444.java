package bakjoon_;
import java.util.Scanner;

public class p_no_2444 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //2*num-1
        int len = 2 * num-1;
        String str = "*";
        for(int i = 0; i < len; i++) {
        	System.out.println(" ");
//        	String str = "*"; //1,3,5,7... 갯수로 별찍기
        	System.out.print("----------------||| "+str);
        	str = "*"+str+"*";
        	if(i >= num-1) {//replace
        		for(int a = 0; a < len-1;a--) {
        			str = "*";
        		}
        	}
        }
//        System.out.println("");
	 }
}

package bakjoon_;
import java.util.Scanner;

public class p_no_10988 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("");
        int sum = 0;
        for(int i=0; i < arr.length; i++) {
        	if(i < arr.length) { //i = 0~9
        		if() {
		        	if(arr[i].equals(arr[i+1])) {
		        		sum ++;
		        	}
        		}
        	}
        }
        System.out.println(sum);
	 }
}

package bakjoon_;
import java.util.Scanner;

public class p_no_3003 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		/*
		 * int num = sc.nextInt(); int[] arr = new int[6]; for(int i=0; i < 5; i++) {
		 * arr[i] = num; }
		 * 간결한 답 > 배열에 1,2,..8을 선언하고 거기서 내가 입력한 숫자들을 빼줌
		 */
        String str = sc.nextLine();
        String[] arr = str.split(" ");
//        System.out.println("1 :::"+Arrays.toString(arr));
        for(int i=0; i < arr.length; i++) {
        	if(i == 0) {
        		int num0 = Integer.parseInt(arr[i]);
        		num0 = 1-num0;
        		arr[i] = Integer.toString(num0);
        	}
        	if(i == 1) {
        		int num1 = Integer.parseInt(arr[i]);
        		num1 = 1-num1;
        		arr[i] = Integer.toString(num1);
        	}
        	if(i == 2) {
        		int num2 = Integer.parseInt(arr[i]);
        		num2 = 2-num2;
        		arr[i] = Integer.toString(num2);
        	}
        	if(i == 3) {
        		int num3 = Integer.parseInt(arr[3]);
        		num3 = 2-num3;
        		arr[3] = Integer.toString(num3);
        	}
        	if(i == 4) {
        		int num4 = Integer.parseInt(arr[i]);
        		num4 = 2-num4;
        		arr[i] = Integer.toString(num4);
        	}
        	if(i == 5) {
        		int num5 = Integer.parseInt(arr[i]);
        		num5 = 8-num5;
        		arr[i] = Integer.toString(num5);
        	}
        	System.out.print(arr[i]+" ");
        }
     
	 }
}


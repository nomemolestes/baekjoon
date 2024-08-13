package bakjoon_;

import java.util.Scanner;

public class p_no_1330 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //한국나이
		int B = sc.nextInt(); //한국나이
		if(A > B){
			System.out.println(">");
		}
		if(A < B){
			System.out.println("<");
		}
		if(A == B){
			System.out.println("==");
		}
	}
}

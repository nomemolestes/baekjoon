package bakjoon_;

import java.util.Scanner;

public class p_no_10430 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //한국나이
		int B = sc.nextInt(); //한국나이
		int C = sc.nextInt(); //한국나이
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
}

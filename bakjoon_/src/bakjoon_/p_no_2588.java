package bakjoon_;

import java.util.Scanner;

public class p_no_2588 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //472
		int B = sc.nextInt(); //385
		int a = B/100; //100의자리수
		int b = B%10; //1의자리수
//		int c = (B-(100*a)-b)/10; //B%10 //10의 자리수
		int d = (B/10)%10; //B%10 10의자리수.. 훨씬 간결 !
//		System.out.println("a :: "+a);
//		System.out.println("b :: "+b);
//		System.out.println("d :: "+d);
		System.out.println(A*b);
		System.out.println(A*d);
		System.out.println(A*a);
		System.out.println(A*B); //마지막
	}
}

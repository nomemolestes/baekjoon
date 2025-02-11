package bakjoon_;
import java.util.Scanner;

public class p_no_2908 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //734
        int b = sc.nextInt(); //893
        
        int rev1 = reversInt(a);
        int rev2 = reversInt(b);
        
        System.out.println(rev1 > rev2 ? rev1 : rev2);

	 }
	 public static int reversInt(int a) {
		 return (a % 10) * 100 + (a / 10 % 10) * 10 + a / 100;
	 }
}


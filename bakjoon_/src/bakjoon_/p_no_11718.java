package bakjoon_;
import java.util.Scanner;

public class p_no_11718 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String res = "";
      String str = "";
        //입력 받고 받고 그대로 담아서 출력+개행
        while(sc.hasNextLine()) { //입력이 잇는동안..............
        	str = sc.nextLine();
        	res += str+"\n";
//        	System.out.println(str);
        	if(str == "") {
        		break;
        	}
        }
        sc.close();
        System.out.println(res);
	 }
}


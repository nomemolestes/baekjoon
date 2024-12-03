package bakjoon_;
import java.util.ArrayList;
import java.util.Scanner;

public class p_no_3052 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        // 10개의 수 입력받기
	        for (int x = 0; x < 10; x++) {
	            int C = sc.nextInt();
	            int A = C % 42;  // 42로 나눈 나머지를 구함
	            
	            // 중복을 제거하기 위해, list에 이미 존재하지 않으면 추가
	            if (!list.contains(A)) {
	                list.add(A);
	            }
	        }

	        // list의 크기는 고유한 나머지의 개수
	        System.out.println(list.size());
	        
	        sc.close();
	    }
}
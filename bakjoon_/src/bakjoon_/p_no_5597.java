package bakjoon_;
import java.util.ArrayList;
import java.util.Scanner;

public class p_no_5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // list1에 1부터 30까지의 출석번호 추가
        for (int i = 1; i <= 30; i++) {
            list1.add(i);
        }

        // 28개의 출석번호 입력받기
        for (int i = 0; i < 28; i++) {
            int N = sc.nextInt();
            list2.add(N);
        }

        // list1에서 list2에 없는 번호 출력
        for (int num : list1) {
            if (!list2.contains(num)) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
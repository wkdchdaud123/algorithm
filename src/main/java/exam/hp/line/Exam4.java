package exam.hp.line;

import java.util.Scanner;

public class Exam4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //INPUT
        //조건 :
            // 작업은 D0의 오름차순으로 제공됩니다.
            // 다른 일을 할 때 다른 일을 할 수 없습니다.

            //5 5개의 work수 제공 (아래로 5개)
                // 0 4 5 (시작일, 기간, 수입 )
                // 3 4 20 (시작일, 기간, 수입 )
                // 6 6 3 (시작일, 기간, 수입 )
                // 8 5 35 (시작일, 기간, 수입 )
                // 10 4 12 (시작일, 기간, 수입 )

        int a = sc.nextInt(); //먼저 표준 입력 장치의 첫 번째 줄에서 작업 수 N을 읽습니다.
        int b = sc.nextInt(); // 다음으로, N 개의 작업을 D0 DI로 읽습니다. 각각 새 줄에서

        //OUTPUT
            //먼저 총 수입을 표준 출력 장치의 첫 번째 줄에 인쇄하십시오.
            // 다음으로 선택한 작업을 각각 새 줄에 D0 D로 인쇄합니다. (시작일 기간)
        System.out.println( a + b );


    }

}

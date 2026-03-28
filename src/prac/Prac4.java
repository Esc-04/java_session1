package prac;

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        //앞에 공백 있이 오름차순으로 별 출력하기

        //코드 작성하기
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int row=1;row<=n;row++){
            for(int i=0;i<n-row;i++){
                System.out.print(" ");
            }
            for(int j=0;j<row;j++){
                System.out.print("*");
            }
            System.out.println();
        }



        /* [실행 결과 예시]
        출력할 줄 개수 입력: 5
            *
           **
          ***
         ****
        *****
         */
    }
}

package prac;

import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        //정수 두 개를 입력 받고, 해당 정수들 사이에 있는 값을 출력하자.
        //첫번째 숫자가 두번째 숫자보다 클 때 적용할 두 숫자를 서로 교환하는 조건문도 작성하자.

        //코드 작성하기
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        if (n>m){
            int tmp=n;
            n=m;
            m=tmp;
        }
        for(int i=n;i<=m;i++){
            System.out.print(i);
            if(i!=m){
                System.out.print(", ");
            }
        }




        /*
        첫 번째 숫자 입력: 10
        두 번째 숫자 입력: 5
        두 숫자 사이에 있는 수: 5, 6, 7, 8, 9, 10
         */
    }
}

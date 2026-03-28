package prac;
import java.util.Scanner;
public class Prac1 {
    public static void main(String[] args) {
        //이름과 나이를 입력받고 출력하기
        Scanner in=new Scanner(System.in);
        int age; String name;
        System.out.print("당신의 이름을 입력 : ");
        name=in.next();
        System.out.print("당신의 나의를 입력 : ");
        age=in.nextInt();
        System.out.printf("당신의 이름은 %s이고, 나이는 %d살 입니다.",name,age);



        /* [실행 결과 예시]
        당신의 이름을 입력 : 최서구
        당신의 나이를 입력 : 25
        당신의 이름은 최서구이고, 나이는 25살 입니다.
         */
    }
}

package ds.java.Part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = 10;
        if(x>=0){
            System.out.println("0 or 양수입니다.");
        }else{
            System.out.println("음수입니다.");
            }

        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int y = scan.nextInt();
        if ((y/2) ==0){
            System.out.println(y +"는 짝수입니다.");
        }else{
            System.out.println(y+"는 홀수입니다.");
        }

        System.out.println("정수를 입력하세요");
        int num = scan.nextInt();
        if(num%12==0){
            System.out.println("12의 배수입니다.");
        }else{
            System.out.println("12의 배수가 아닙니다.");
        }
        System.out.println("연도를 입력하세요");
        int year = scan.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다.");
        }
    }
}

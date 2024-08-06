package ds.java.Part2;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int num = scan.nextInt();
        if((num%7)==0){
            System.out.println(num+"은(는) 7의 배수입니다.");
        }else{
            System.out.println(num+"은(는) 7의 배수가 아닙니다.");
        }

        System.out.println("나이를 입력하세요");
        int age = scan.nextInt();
        if (age >=19){
            System.out.println("성인입니다.");
        }else{
            System.out.println("미성년자입니다.");
        }
    }
}

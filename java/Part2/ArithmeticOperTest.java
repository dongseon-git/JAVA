package ds.java.Part2;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit = 2625;
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);

        int num = 2579;
        int x = num%10;
        int y = num/10%10;
        int z = num/100%10;
        int w = num/1000%10;
        System.out.println("x+y+z+w =" + (x+y+z+w));

        int su = 5;
        if(su%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
            }
}

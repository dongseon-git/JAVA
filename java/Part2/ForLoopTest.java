package ds.java.Part2;

public class ForLoopTest {
    public static void main(String[] args) {
    for(int i = 1; i<=10; i++){
        System.out.println(i);
    }
    for(char c = 'A'; c <='Z'; c++){
        System.out.println(c);
    }
    for(char s = 'a';s<='z';s++){
        System.out.println(s);
    }

    for(int i =65; i <=90;i++){
        System.out.println((char)i +"="+i);
    }
    int[] number  ={1,2,3,4,5,6,7,8,9,10};
    for(int i = 0; i < number.length;i++){
        System.out.println(number[i]);
    }

    //foreach문
        for(int su : number){
            System.out.println(su);
        }


    }
}

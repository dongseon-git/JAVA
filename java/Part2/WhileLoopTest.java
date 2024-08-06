package ds.java.Part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        //0~5까지 출력
        int i =0;
        while(i < 6){
            System.out.println(i);
            i++;
            int [] number ={1,2,3,4,5,6,7,8,9,10};
           i=0;
           while(i<number.length){
               System.out.println(number[i]);
                i++;
           }
            System.out.println(i);

           i = 1;
           do{
               System.out.println(i);
               i++;
           }while(i <=5);
        }

    }
}

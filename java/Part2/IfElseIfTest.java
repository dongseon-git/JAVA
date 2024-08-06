package ds.java.Part2;

public class IfElseIfTest {
    public static void main(String[] args) {
      int score = 184;
      if(score>=0&&score<=100) {
          if (score >= 90) {
              System.out.println("A반입니다.");
          } else if (score >= 85) {
              System.out.println("B반입니다.");
          } else {
              System.out.println("C반입니다.");
          }
      }else{
          System.out.println("유효한 점수가 아닙니다.");
      }
    }
}

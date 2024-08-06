package ds.java.Part2;

public class OverLoadingTest {
    public static void main(String[] args) {
       float v = add(35.6f, 56.7f);
        System.out.println("v = " + v);
        int x = add(23, 43);
        System.out.println("x = " + x);
    }
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static float add(float a, float b){
        float sum = a+b;
        return sum;
        
    }
}

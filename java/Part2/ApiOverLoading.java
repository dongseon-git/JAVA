package ds.java.Part2;

public class ApiOverLoading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");
        int max = maxValue(7,9);
        System.out.println("max = " + max);
        
        int min = minValue(3,8);
        System.out.println("min = " + min);
    }
    public static int maxValue(int a, int b){
        return (a>b) ? a : b;
    }
    public static int minValue(int a, int b){
        return (a<b) ? a : b;
    }
}
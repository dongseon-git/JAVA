package ds.java.Part2;

public class MaxMinValue {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        //min value
        int min= (x < y)? x : y;
        System.out.println("min = " + min);
        int max = (x>y)? x : y;
        System.out.println("max = " + max);
    }
}

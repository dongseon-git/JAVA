package ds.java.Part2;

public class CastingTest {
    public static void main(String[] args) {
        float f1 = .10f;
        System.out.println("f1 = " + f1);
        float f2 =15f;
        System.out.println("f2 = " + f2);
        float f3 = 3.14f;
        System.out.println("f3 = " + f3);
        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        float x = 15.6f;
        int y = (int)x;
        System.out.println("y = " + y); 

        char c = 'A';
        int cc = c;
        System.out.println("cc = " + cc);

        int dd = 5;
        double ddd= dd;
        System.out.println("ddd = " + ddd);
        
        double dx = 14.67;
        int dy = (int)dx;
        System.out.println("dy = " + dy);

    }
}


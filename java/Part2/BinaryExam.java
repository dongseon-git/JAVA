package ds.java.Part2;

public class BinaryExam {
    public static void main(String[] args) {

        int data = 123;
        String binary = Integer.toBinaryString(data);
        System.out.println("binary = " + binary);
        String octal = java.lang.Integer.toOctalString(data);
        System.out.println("octal = " + octal);
        String hexa = java.lang.Integer.toHexString(data);
        System.out.println("hexa = " + hexa);

        int x = 123;
        System.out.println("x = " + x);
        int y = 0b1111011;
        System.out.println("y = " + y);
        int z = 0173;
        System.out.println("z = " + z);
        int u = 0x7b;
        System.out.println("u = " + u);

    }
}

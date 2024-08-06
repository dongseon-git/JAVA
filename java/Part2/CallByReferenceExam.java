package ds.java.Part2;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
    int result =addArray(a);
        System.out.println("result = " + result);
    }
    public static int addArray(int[] a){
    int sum=0;
    for(int i=0; i<a.length; i++){
        sum = sum+a[i];

    }
    return sum;
    }
}

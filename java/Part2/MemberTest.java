package ds.java.Part2;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 30;
        m.phonenumber = "010-1111-1111";
        m.email = "dongseon@naver.com";
        m.area = "서울";
        m.weight = 57.6;

        System.out.println(m.name + "\t" + m.age + "\t" + m.phonenumber + "\t" + m.email + "\t" + m.area +  "\t" + m.weight);
    }
}
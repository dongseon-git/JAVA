package ds.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        //Q. person 클래스에 이름, 나이. 전화번호를 저장하고 출력하시오
        Person p = new Person();
        p.name = "김동선";
        p.age = 28;
        p.phone = "010-123-1234";
        System.out.println(p.name +"\t" + p.age + "\t" + p.phone);
    }
}

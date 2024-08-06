package ds.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        //한사람의 데이터를 저장할 [변수를 선언]하세요.
        //모델링 된 person클래스를 이용하여 [객체를 메모리에 생성] 하세요.
        //인스턴스를 만드는 과정
        Person p = new Person();
        p.name = "김동선";
        p.age = 30;
        p.phone = "010-1111-1111";
        System.out.println(p.name + "\t"+ p.age + "\t" + p.phone);

        p.play();
        p.eat();
        p.walk();

    }
}


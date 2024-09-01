package ds.java.part3;

import ds.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "김동선";
        //dto.age = 28; (에러발생-접근불가)
        dto.phone = "010-1234-1234";
        System.out.println(dto.name + "\t" + dto.phone);
        dto.play();
    }
}

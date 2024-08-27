package ds.java.model;

public class CarDAO {
    // C.R.U.D
    // create = insert(저장)

    public  void carInsert(CarDTO car){
    //DB 연결
        System.out.println("car 정보가 DB에 저장되었습니다.");
    }
    public void carSelect(){
        System.out.println("car 정보가 출력되었습니다.");
    }
}

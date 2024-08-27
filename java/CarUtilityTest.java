package ds.java.part3;

import ds.java.model.CarDTO;
import ds.java.model.CarUtility;

public class CarUtilityTest {
    // car 정보를 출력하는 동작을 가지고있는 Utility 클래스를 설계해보자
    public static void main(String[] args) {
        //매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하자
     int carSn = 1110;
     String carName = "BMW828i";
     int carPrice = 90000;
     String carOwner = "김동선";
     int carYear = 2015;
     String carType = "G";

     CarDTO car = new CarDTO();
     car.carSn = carSn;
     car.carName = carName;
     car.carPrice= carPrice;
     car.carOwner= carOwner;
     car.carYear = carYear;
     car.carType= carType;
     //carPrint(car);
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }

}

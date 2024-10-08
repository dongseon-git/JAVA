package ds.java.part3;

import ds.java.model.CarDAO;
import ds.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //  자동차정보를 키보드로부터 입력을 받아서 DB에 저장하세요.
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차일련번호 : ");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차이름 : ");
        String carName = scan.nextLine();

        System.out.println("자동차가격 : ");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차소유자 : ");
        String carOwner = scan.nextLine();

        System.out.println("자동차연식 : ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차타입 : ");
        String carType = scan.nextLine();

        //System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        //자동차 데이터를 이동하기 위한 바구니가 필요하다(DTO,VO)
        //클래스로 CarDTO, CarVO 모델을 설계
        // carInfoPrint(carSn,carName,carPrice,carOwner,carYear,carType);
        CarDTO car = new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}

package exam;

public class BusExam{
    public static void main(String args[]){
        Car car = new Car("페라리");
        car.run();
        //car.ppangppang(); // 컴파일 오류 발생

        Bus bus = (Bus)car;  //부모타입을 자식타입으로 형변환
        bus.run();
        bus.ppangppang();

        Car.age = 88;
    }
}
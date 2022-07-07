package exam;

public class Bus extends Car {

    public Bus(){
        super("소방차"); // 문자열을 매개변수로 받는 부모 생성자를 호출하였다.
        System.out.println("Bus의 기본생성자입니다.");
    }
    public void ppangppang(){
        System.out.println("빵빵");
    }
}

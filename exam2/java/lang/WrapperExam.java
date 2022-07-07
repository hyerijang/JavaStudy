package exam2.java.lang;

public class WrapperExam {

    public static void main(String[] args) {
        // 기본형 타입 : int
        int i = 5;
        // 기본형타입을 객체로 변환시킬때 사용하는 Wrapper클래스
        // int -> 객체형 = Integer
//        Integer i2 = new Integer(5);
        Integer i2 = new Integer(5);
        Integer i3 = 5; // 오토 박싱 : 기본 타입 데이터를 객체 타입에 넣어도 자동으로 변환해줌
        int i4 = i3.intValue();
        int i5 = i3; // 오토 언박싱


        System.out.println(i3.longValue());
        System.out.println(i3.MAX_VALUE);

    }

}

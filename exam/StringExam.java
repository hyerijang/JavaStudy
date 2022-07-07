package exam;

public class StringExam {

    public static void main(String[] args) {
        //1.new연산자를 이용하지 않고 인스턴스를 만드는 경우
        //"hello"라는 문자열이 메모리 중에서 상수가 저장되는 영역에 저장
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1==str2); // True

        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3==str4); // False

        if( str3.equals(str4) ){ // 변수가 저장하는 문자열이 같은지 확인할 때
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        }


        String str5 = "hello world";
        String str6 = str5.substring(3);
        System.out.println("str6 = " + str6);
    }

}

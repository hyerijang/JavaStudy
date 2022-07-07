package exam2.java.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.time 패키지 쓰세용
 */
public class DateExam {

    public static void main(String[] args) {
        Date date = new Date(); // 인스턴스가 생성된 시점의 시간 정보 저장
        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date));

        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());

    }


}

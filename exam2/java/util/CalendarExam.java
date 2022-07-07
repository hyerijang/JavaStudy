package exam2.java.util;

import java.util.Calendar;

public class CalendarExam {

    public static void main(String[] args) {
        // 추상클래스 -> new 를 써서 인스턴스를 생성할 수 없다.
        Calendar cal = Calendar.getInstance(); // Calendar 의 자식 클래스인

        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 월은 0부터 시작합니다.
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        System.out.println("minute = " + minute);
        //11분 빼기
        cal.add(Calendar.MINUTE, -11);
        minute = cal.get(Calendar.MINUTE);
        System.out.println("minute = " + minute);
    }
}

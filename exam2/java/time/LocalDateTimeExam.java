package exam2.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//Java SE 8 ~
public class LocalDateTimeExam {

    public static void main(String[] args) {
        LocalDateTime tp = LocalDateTime.now();

        LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
        LocalDate ld2 = LocalDate.of(2012, 12, 12);

        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(17, 18);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("14:17");
        System.out.println(lt2);

        LocalDateTime ldt = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt);

        LocalDate theDate = tp.toLocalDate();
        System.out.println(theDate);
        System.out.println(tp.getMonth());//문자
        System.out.println(tp.getMonthValue()); // 숫자
        System.out.println(tp.getMonth().getValue()); // 숫자
    }

}

package exam;

import java.util.Calendar;

public class SwitchExam {

    public static void main(String[] args) {
        // month에는 오늘이 몇 월인지 들어 있습니다.
        for (int month = 1; month <= 12; month++) {

            String season = "겨울";
            // switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
            int tmp = month / 3;

            switch (tmp) {
                case 1:
                    season = "봄";
                    break;
                case 2:
                    season = "여름";
                    break;
                case 3:
                    season = "가을";
                    break;
            }

            System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
        }
    }
}
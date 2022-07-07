package exam2.java.lang;

public class MathExam {

    public static void main(String[] args) {
        int value1 = Math.max(5, 20);
        int value2 = Math.min(5, -5);
        int value3 = Math.abs(-10);
        double value4 = Math.random();
        double value5 = Math.sqrt(25);

        double f = Math.floor(99.2);//내림
        double c = Math.ceil(99.2);//올림
        System.out.println("f = " + f);
        System.out.println("c = " + c);
        
        double r = Math.rint(10.5);//가장 가까운 정수 반환 (반올림)
        double ro = Math.round(10.5);//반올림
        System.out.println("r = " + r);
        System.out.println("ro = " + ro);

    }
}

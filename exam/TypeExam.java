package exam;

public class TypeExam {

    public static void main(String[] args) {

        int intV = 50000;
        long longV = intV;

        int intV2 = (int) longV;

//        System.out.println("maxShort = "+ Short.MAX_VALUE);
        System.out.println("maxINT = " + Integer.MAX_VALUE);
        System.out.println("maxFloat = "+ Float.MAX_VALUE);

        float floatV = Integer.MAX_VALUE;

        System.out.println("floatV = " + floatV);
    }

}

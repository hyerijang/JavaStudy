package exam;

public class ArrayExam {

    public static void main(String[] args) {

        // 선언
        int[] array1 = new int[4];

        //배열에 값을 저장
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;

        //선언과 동시에 초기화
        int[] array2 = new int[]{1, 2, 3, 4, 5};

        int[] iarray = new int[100];

        int sum = 0;

        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = i + 1;
            System.out.println("iarray[i] = " + iarray[i]);
        }

        for (int i = 0; i < iarray.length; i++) {
            sum += iarray[i];
        }

        System.out.println("sum = " + sum);

        //이차원배열 생성
        int[][] array4 = new int[][]{{1}, {2, 3, 4}, {5}}; //선언과 동시에 초기화

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.println("array4[i][j] = " + array4[i][j]);
            }
        }

        //가변크기 2차원 배열 생성
        int[][] array5 = new int[3][];
        //        array5[0] = 1; //안됨
        array5[0] = new int[]{1}; // 1차원 배열을 만들어서 넣어줘야한다

        // for each : java 1.5부터 추가
        int[] iarr = {10, 20, 30, 40, 50};
        for (int value : iarr) {
            System.out.println("value = " + value);
        }
    }
}


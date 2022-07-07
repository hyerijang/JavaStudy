package exam2.java.io.char단위;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam {
    // NOTE : 키보드로 입력 받을 때 -> char 단위로 입력받게 됨.
    // 키보드로부터 한줄 씩 읽기

    public static void main(String[] args) {
        String line = null;

        // InputStreamReader : InputStream인 System.in을 Reader로 변환
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("line = " + line);


    }
}

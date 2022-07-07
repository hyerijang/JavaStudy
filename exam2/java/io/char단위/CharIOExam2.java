package exam2.java.io.char단위;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam2 {

    public static void main(String[] args) {
        //NOTE: 파일로부터 한줄씩 읽기
        String line = null;

        BufferedReader br = null;
        PrintWriter printWriter = null;

        try {
            br = new BufferedReader(new FileReader("src/애국가.txt"));
            printWriter = new PrintWriter(
                new FileWriter("src/애국가char2.txt")); // 더 편리하게 쓰기위해 PrintWriter 사용
            while ((line = br.readLine()) != null) { //char 단위로 하면 한줄씩 쓰기 가능
                printWriter.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}

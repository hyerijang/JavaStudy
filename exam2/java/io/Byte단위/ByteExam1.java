package exam2.java.io.Byte단위;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {

    public static void main(String[] args) {
        // NOTE : Byte 단위 입출력 클래스
        // 클래스의 이름이 InputStream 이나 OutputStream으로 끝난다.

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("src/애국가.txt");
            fileOutputStream = new FileOutputStream("src/애국가_copy.txt");

            // NOTE : read()는 **int** 를 리턴한다.
            // -> byte를 리턴하면 끝을 표현할 수 없기 때문
            int readData = -1; //음수 : 읽어들일 것이 없음
            while ((readData = fileInputStream.read()) != -1) {
                fileOutputStream.write(readData);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // TODO : 반드시 닫아줘야 한다.

            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

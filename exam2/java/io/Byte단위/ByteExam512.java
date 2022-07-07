package exam2.java.io.Byte단위;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam512 {
    // 1바이트 씩 읽는 것보다 수행시간 짧음
    // -> 파일 읽을 때 기본적으로 512바이트 단위로 읽기 때문
    // -> 따라서 파일 읽을 때 512의 배수로 책정하는 것이 좋다.

    public static void main(String[] args) {
        // NOTE : Byte 단위 입출력 클래스 (512바이트)
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("src/애국가.txt");
            fileOutputStream = new FileOutputStream("src/애국가_copy.txt");

            int readCount = -1; //읽어온 문자열의 길이
            byte [] buffer =  new byte[512];// NOTE : 추가된 부분, 512 바이트 씩 읽음
            while ((readCount = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer,0,readCount); // NOTE : 수정된 부분, 수정하지 않으면 글자 깨지거나 줄바꿈 문제 발생
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

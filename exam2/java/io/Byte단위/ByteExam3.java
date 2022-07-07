package exam2.java.io.Byte단위;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

    public static void main(String[] args) {

        try (
            DataOutputStream out = new DataOutputStream(new FileOutputStream("src/out3.txt"));
        ) {
            // NOTE: Try with 문법 : try 옆에 ()
            // Exception이 발생하지 않으면 자동으로 io객체 close해준다.
            out.writeInt(100);
            out.writeBoolean(true);
            out.writeDouble(50.5);
        } catch (
            Exception e) {
            e.printStackTrace();
        }

    }
}

package exam2.java.io.Byte단위;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ByteExam4 {

    public static void main(String[] args) {
        try (
            DataInputStream dis = new DataInputStream(new FileInputStream("src/out.txt"));
        ) {

            //NOTE: 저장된 순서대로 읽어내야 함
            int i = dis.readInt();
            System.out.println("i = " + i);
            boolean b = dis.readBoolean();
            System.out.println("b = " + b);
            double d = dis.readDouble();
            System.out.println("d = " + d);
        } catch (FileNotFoundException e) {
            System.out.println("파일없음");

        } catch (
            Exception e) {
            e.printStackTrace();
        }


    }
}

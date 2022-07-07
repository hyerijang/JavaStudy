package exam2.java.io.Byte단위;

public class MyFileInputStream implements AutoCloseable {

    private String file;

    @Override
    public void close() throws Exception {
        System.out.println( "stream 이 종료됩니다. ");
    }
}

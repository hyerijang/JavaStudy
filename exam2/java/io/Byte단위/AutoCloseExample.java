package exam2.java.io.Byte단위;

public class AutoCloseExample {

    public static void main(String[] args) {

        try (
            MyFileInputStream stream = new MyFileInputStream()
        ) {
            throw new RuntimeException(); // NOTE : 1.예외 발생하면 스트림 자동으로 close 됨
        } catch (
            RuntimeException e) {
            e.printStackTrace();// NOTE : 2. cathe문 실행
        } catch (Exception ee) {
            ee.printStackTrace();
        }

    }


}

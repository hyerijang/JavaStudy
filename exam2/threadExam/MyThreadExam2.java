package exam2.threadExam;

public class MyThreadExam2 {


    public static void main(String[] args) {
        //NOTE : Mythread2 가 다른 클래스를 상속받아서 Thread 상속받지 못하는 경우, Runnerable 인터페이스를 사용하면 됨

        //MyThread2는 Runnerable 인터페이스를 사용
        MyThread2 r1 = new MyThread2("1");
        MyThread2 r2 = new MyThread2("2");

        // TODO: Thread 를 생성
        // MyThread2 는 Thread 를 상속받은게 아니기 때문에 start() 메소드 없음
        // 따라서 수행하기 위해 Thread 객체를 만들어 준다.
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        System.out.println("!!main Thread end!"); //이미 메인은 종료
    }
}

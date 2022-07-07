package exam2.threadExam;

public class MyThreadExam {


    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1("1");
        MyThread1 myThread2 = new MyThread1("2");
        //todo : 주의. run이 아닌 start 를 사용해야함
        // start는 멀티스레드로 동작
        // run으로 하면 싱글스레드로 동작, 즉 자식 스레드가 종료된 다음 main 스레드 종료 문구 출력
//        myThread1.start();
//        myThread2.start();

//        myThread2.run();
        System.out.println("main Thread end!"); //이미 메인은 종료
    }
}

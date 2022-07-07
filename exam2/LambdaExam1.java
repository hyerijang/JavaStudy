package exam2;

import exam2.threadExam.ThreadA;

public class LambdaExam1 {

    public static void main(String[] args) {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("스레드 start");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("스레드 end");
//            }
//        }).start();

        new Thread(() -> {
            System.out.println("스레드 start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("스레드 end");
        }).start();

    }

}

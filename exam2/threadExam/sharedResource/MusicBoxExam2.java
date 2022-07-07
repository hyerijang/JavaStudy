package exam2.threadExam.sharedResource;

public class MusicBoxExam2 {

    public static void main(String[] args) {
        // MusicBox2 인스턴스 :  Synchronized
        MusicBox2 box = new MusicBox2();

        // NOTE : 하나의 box를 3명이 함께 쓴다.
        MusicPlayer kim = new MusicPlayer(1, box);
        MusicPlayer lee = new MusicPlayer(2, box);
        MusicPlayer kang = new MusicPlayer(3, box);

        // MusicPlayer쓰레드를 실행합니다.
        // 메소드 앞에 synchronized 를 붙혀서 실행해 보면, 메소드 하나가 모두 실행된 후에 다음 메소드가 실행된다.
        // 해당 모니터링 락은 메소드 실행이 종료되거나, wait()와 같은 메소드를 만나기 전까지 유지된다.
        // 다른 쓰레드들은 모니터링 락을 놓을때까지 대기한다.
        kim.start();
        lee.start();
        kang.start();
    }
}
package exam2.threadExam.sharedResource;

public class MusicBoxExam1 {

    public static void main(String[] args) {
        // MusicBox 인스턴스
        MusicBox box = new MusicBox();

        // NOTE : 하나의 box를 3명이 함께 쓴다.
        MusicPlayer kim = new MusicPlayer(1, box);
        MusicPlayer lee = new MusicPlayer(2, box);
        MusicPlayer kang = new MusicPlayer(3, box);

        // MusicPlayer쓰레드를 실행합니다.
        kim.start();
        lee.start();
        kang.start();
    }
}
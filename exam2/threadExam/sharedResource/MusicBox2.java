package exam2.threadExam.sharedResource;

public class MusicBox2 extends MusicBox{
    //신나는 음악!!! 이란 메시지가 1초이하로 쉬면서 10번 반복출력
    @Override
    public void playMusicA(){
        for(int i = 0; i < 10; i ++){
            synchronized (this) {
                System.out.println("1 신나는 음악!!!");
            }
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for
    } //playMusicA

    //슬픈 음악!!!이란 메시지가 1초이하로 쉬면서 10번 반복출력
    @Override

    public synchronized  void playMusicB(){
        for(int i = 0; i < 10; i ++){
            System.out.println("2 슬픈 음악!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for
    } //playMusicB
    //카페 음악!!! 이란 메시지가 1초이하로 쉬면서 10번 반복출력
    @Override
    public void playMusicC(){
        // synchronized를 붙히지 않음 -> 중간중간 실행된다.
        for(int i = 0; i < 10; i ++){
            synchronized (this){
                //문제가 있을 것 같은 부분만 synchronized를 붙이면 전체 메소드가 아닌 그 부분만 모니터링 락으로 관리
            System.out.println("3 카페 음악!!!");
            }
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for
    } //playMusicC
}
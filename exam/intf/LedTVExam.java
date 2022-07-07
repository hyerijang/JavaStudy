package exam.intf;

public class LedTVExam {
    public static void main(String args[]){
        TV tv = new LedTV();
        tv.turnOn();;
        tv.changeVolume(50);
        tv.changeChannel(6);
        tv.turnOff();
    }
}

package exam2.java.util.collection;

public class BoxExam {

    public static void main(String[] args) {
        Box<Object> box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();

        Box<String> box2 = new Box();
        box2.setObj("hello");
        String str = (String) box2.getObj();
        System.out.println(str);

        Box<Integer> box3 = new Box();
        box3.setObj(1);
        int v = (int) box3.getObj();
        System.out.println(v);
    }

}

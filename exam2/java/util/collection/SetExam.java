package exam2.java.util.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("kim");
        boolean flag2 = set1.add("lee");
        boolean flag3 = set1.add("kim");

        System.out.println("set1.size() = " + set1.size());
        System.out.println("flag3 = " + flag3);

        //Iterator
        Iterator<String> iter = set1.iterator();


        while (iter.hasNext()) {
            String str = iter.next(); // next()메소드는 하나를 꺼낸다. 하나를 꺼내면 자동으로 다음것을 참조한다.
            System.out.println(str);
            System.out.println("set1.size() = " + set1.size());
        }

        Iterator<String> iter2 = set1.iterator();
        while (iter2.hasNext()) {
            String str = iter2.next(); // next()메소드는 하나를 꺼낸다. 하나를 꺼내면 자동으로 다음것을 참조한다.
            System.out.println(str);
            System.out.println("set1.size() = " + set1.size());
        }



    }

}

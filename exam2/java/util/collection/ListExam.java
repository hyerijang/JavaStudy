package exam2.java.util.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

    public static void main(String[] args) {
        List<String> li = new ArrayList<>();

        li.add("Kim");
        li.add("Kim");


        Iterator<String> iter = li.iterator();

        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }

}

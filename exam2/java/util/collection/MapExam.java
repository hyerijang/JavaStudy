package exam2.java.util.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("kim", 3);
        map.put("lee", 3);
        map.put("lee", 999); //덮어씌워진다

        System.out.println(map.size());

        Iterator<String> iter = map.keySet().iterator();

        while(iter.hasNext())
        {
            String key = iter.next();
            System.out.println(key + " : " + map.get(key));

        }



    }

}

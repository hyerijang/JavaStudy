package exam;

import com.test.Hello;

public class AccessObjExam {

    public static void main(String[] args) {

        AccessObj po = new AccessObj();
//        System.out.println(po.i); // 컴파일 오류가 발생합니다.
        System.out.println(po.k);
        System.out.println(po.p);
        System.out.println(po.p2);

        Hello.edit("name");

    }
}

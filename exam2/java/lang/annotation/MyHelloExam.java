package exam2.java.lang.annotation;

import java.lang.reflect.Method;

public class MyHelloExam {


    public static void main(String[] args) {

        MyHello myHello = new MyHello();

        try {
            Method method = myHello.getClass().getDeclaredMethod("hello");
            if (method.isAnnotationPresent(Count100.class)) {
                System.out.println("hello 메서드에 @Count100 적용!!");

                for (int i = 0; i < 100; i++) {
                    myHello.hello();
                }
            } else {
                //NOTE : Myhello 클래스에만 @Count100 적용하면 메소드에는 적용 안된것으로 뜸. 
                System.out.println("hello 메서드에 @Count100 적용안됨");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

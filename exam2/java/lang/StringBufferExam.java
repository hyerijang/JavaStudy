package exam2.java.lang;

public class StringBufferExam {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println("str = " + str);

        StringBuffer sb2 = new StringBuffer();
        sb.append("hello world2");

        //StringBuffer가 가지고 있는 메소드들은 대부분 자기 자신, this를 반환
        StringBuffer sb3 = sb2.append("3333"); //this 반환

        if (sb2 == sb3) {
            System.out.println("sb2 == sb3" ); //같다!
        }

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);
    }


}

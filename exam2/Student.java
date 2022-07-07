package exam2;

public class Student {

    String name;
    String number;
    int birthYear;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "name:" + this.name + " number:" + this.number + " birthYear:" + this.birthYear;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1998;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1998;

        if (s1 == s2) {
            System.out.println("동일합니다.");
        } else {
            System.out.println("다릅니다");

        }

        if (s1.equals(s1)) {

            System.out.println("동일합니다.");
        } else {
            System.out.println("다릅니다");

        }

        System.out.println("s2 = " + s2);
        System.out.println("s2.toString() = " + s2.toString());
    }
    }

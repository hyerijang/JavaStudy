package exam;


public class ScopeExam {

    int a = 0;
    static  int sa = 1;
    public static void main(String[] args) {
    // static 한 글로벌 변수만 사용가능

//        System.out.println("a = " + a);
        System.out.println("sa = " + sa);

        System.out.println("VariableScopeExam.staticVal = " + VariableScopeExam.staticVal);
        VariableScopeExam.staticVal = 7;
        System.out.println("VariableScopeExam.staticVal 수정가능 = " + VariableScopeExam.staticVal);

        VariableScopeExam variableScopeExam = new VariableScopeExam();
        VariableScopeExam variableScopeExam2 = new VariableScopeExam();

        variableScopeExam.staticVal = 8;
        System.out.println("static 변수는  공유된다= " + VariableScopeExam.staticVal);
        variableScopeExam2.staticVal = -1;
        System.out.println("static 변수는  공유된다= " + VariableScopeExam.staticVal);
    }



}

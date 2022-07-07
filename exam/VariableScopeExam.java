package exam;

public class VariableScopeExam {

    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value) {
        int localScope = 20;
    }

    public static void main(String[] args) {
        System.out.println(staticVal);      //사용가능
    }
}

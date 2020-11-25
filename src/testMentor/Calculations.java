package testMentor;

public class Calculations {
    private static int answer = 0;
    public static int Calculate (String astr, String bstr, char signstr) throws testMentor.MyException {
        testMentor.RomeToArabic rtd = new testMentor.RomeToArabic();
        int a = rtd.romeToArabic(astr);
        int b = rtd.romeToArabic(bstr);
        switch (signstr){
            case '+':
                answer = a + b;
                break;

            case  '-':
                answer = a - b;
                break;

            case '/':
                answer = a / b;
                break;

            case '*':
                answer = a * b;
                break;
        }
        return answer;
    }

    public static int Calculate (int aint, int bint, char signint) throws testMentor.MyException {
        switch (signint){
            case '+':
                answer = aint + bint;
                break;

            case  '-':
                answer = aint - bint;
                break;

            case '/':
                answer = aint / bint;
                break;

            case '*':
                answer = aint * bint;
                break;
        }
        return answer;
    }
}

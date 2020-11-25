package testMentor;

public class RomeToArabic {  //Класс переводчика с римского
    static int strLength = 0;
    static int risingCount = 0;
    static int reduceCount = 0;

    public static int romeToArabic(String romanNumber) throws testMentor.MyException {
        strLength = romanNumber.length();
        int dec = 0;
        int finalNumeral = 0;
        int mcounter = 0, dcounter = 0, ccounter = 0, lcounter = 0, xcounter = 0, vcounter = 0, icounter = 0;
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char ConvertToDec = romanNumber.charAt(i);

            switch (ConvertToDec) {
                case 'M':
                    dec = processNumeral(1000, finalNumeral, dec);
                    finalNumeral = 1000;
                    mcounter++;
                    dcounter = 0;
                    ccounter = 0;
                    lcounter = 0;
                    xcounter = 0;
                    vcounter = 0;
                    icounter = 0;
                    if (mcounter > 3) throw new testMentor.MyException("Wrong Rome number");
                    break;

                case 'D':
                    dec = processNumeral(500, finalNumeral, dec);
                    finalNumeral = 500;
                    dcounter++;
                    mcounter = 0;
                    ccounter = 0;
                    lcounter = 0;
                    xcounter = 0;
                    vcounter = 0;
                    icounter = 0;
                    if (dcounter > 3) throw new testMentor.MyException("Wrong Rome number");
                    break;

                case 'C':
                    dec = processNumeral(100, finalNumeral, dec);
                    finalNumeral = 100;
                    ccounter++;
                    dcounter = 0;
                    mcounter = 0;
                    lcounter = 0;
                    xcounter = 0;
                    vcounter = 0;
                    icounter = 0;
                    if (ccounter > 3) throw new testMentor.MyException("Wrong Rome number");
                    break;

                case 'L':
                    dec = processNumeral(50, finalNumeral, dec);
                    finalNumeral = 50;
                    lcounter++;
                    dcounter = 0;
                    ccounter = 0;
                    mcounter = 0;
                    xcounter = 0;
                    vcounter = 0;
                    icounter = 0;
                    if (lcounter > 3) throw new testMentor.MyException("Wrong Rome number");
                    break;

                case 'X':
                    dec = processNumeral(10, finalNumeral, dec);
                    finalNumeral = 10;
                    xcounter++;
                    dcounter = 0;
                    ccounter = 0;
                    lcounter = 0;
                    mcounter = 0;
                    vcounter = 0;
                    icounter = 0;
                    if (xcounter > 3) throw new testMentor.MyException("Wrong Rome number");
                    break;

                case 'V':
                    dec = processNumeral(5, finalNumeral, dec);
                    finalNumeral = 5;
                    vcounter++;
                    dcounter = 0;
                    ccounter = 0;
                    lcounter = 0;
                    xcounter = 0;
                    mcounter = 0;
                    icounter = 0;
                    if (vcounter > 3) throw new testMentor.MyException("Wrong Rome number");
                    break;

                case 'I':
                    dec = processNumeral(1, finalNumeral, dec);
                    finalNumeral = 1;
                    icounter++;
                    dcounter = 0;
                    ccounter = 0;
                    lcounter = 0;
                    xcounter = 0;
                    vcounter = 0;
                    mcounter = 0;
                    if (icounter > 3) throw new testMentor.MyException("Wrong Rome number");
                    break;
            }
        }
        return dec;
    }

    public static int processNumeral(int decimal, int lastNumber, int lastDecimal) throws testMentor.MyException {
        if (reduceCount > risingCount) throw new testMentor.MyException("Wrong Rome number");

        if (lastNumber > decimal) {
            reduceCount++;
            return lastDecimal - decimal;
        } else {
            risingCount++;
            return lastDecimal + decimal;


        }
    }

}


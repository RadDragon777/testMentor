package testMentor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String expr = reader.readLine();
            Pattern1 parrr = new Pattern1();
            if (!parrr.Pattern1 (expr)) throw new testMentor.MyException("------Incorrect expression!---------");
            testMentor.Calculations calc = new testMentor.Calculations();
            if (expr.matches("^\\d+.*")) {
                String[] abstring = expr.split("[\\+-/*]",2);
                int aint1 = Integer.parseInt(abstring[0]);
                int bint1 = Integer.parseInt(abstring[1]);
                if (bint1 == 0) throw new testMentor.MyException("------Division by zero!---------");
                char sign = expr.charAt(abstring[0].length());
                System.out.println(calc.Calculate(aint1,bint1,sign));
            }
            else {
                testMentor.RomanNumber rn = new testMentor.RomanNumber();
                String[] abstring = expr.split("[\\+-/*]",2);
                String astring = abstring[0];
                String bstring = abstring[1];
                char sign = expr.charAt(abstring[0].length());
                System.out.println(rn.toRoman(calc.Calculate(astring,bstring,sign)));
            }
        }
        catch (MyException | IOException e) {
            System.out.println(e);
        }
    }
}
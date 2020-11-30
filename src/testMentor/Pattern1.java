package testMentor;

import java.util.regex.Matcher; //Импортируем Матчера (совпадальщика)
import java.util.regex.Pattern; //Импортируем пакет регулярных выражений

public class Pattern1 {
    public static boolean Pattern1(String s)

    {
        Pattern p1 = Pattern.compile("[ ]*\\d+[ ]*[\\+-/*]?[ ]*\\d+[ ]*");
        Pattern p2 = Pattern.compile("[ ]*[CDILMVX]+[ ]*[\\+-/*]?[ ]*[CDILMVX]+[ ]*");
        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        return (m1.matches()||m2.matches());
    }
}



package testMentor;

import java.util.regex.Matcher; //Импортируем Матчера (совпадальщика)
import java.util.regex.Pattern; //Импортируем пакет регулярных выражений

public class Example {
    public static boolean Pattern1(String s)

    {
        Example p1 = Example.compile("[ ]*\\d+[ ]*[\\+-/*]?[ ]*\\d+[ ]*");
        Example p2 = Example.compile("[ ]*[CDILMVX]+[ ]*[\\+-/*]?[ ]*[CDILMVX]+[ ]*");
        Matcher m1 = p1.matcher(s);
        Matcher m2 = p2.matcher(s);
        return (m1.matches()||m2.matches());
    }

}



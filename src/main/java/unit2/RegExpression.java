package unit2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

    public static void main(String[] args) {

        String text = "I study Java!";

        String pattern = "[ IJa-z!]+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.matches()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(m.matches() ? "true" : "false");



                /*
        . - перевірка на будь-який символ
        [0-9]+ перевірка на цифри
        \d [0-9]
        \D [^0-9] - всі символи, окрім [0-9]
        \w [a-zA-Z_0-9] -перевірка на великі та малі символи + "_" + [0-9]
        \W [^a-zA-Z_0-9]
        \b - границя слова
        \B - заперечення границі слова
        \t - символ табуляції
        \r - повернення каретки
        \f - розрив сторінки
        \n - перехід на новий рядок
        \s [ \t\n\f\r]
        \S
        [abc] - aбо а, або b, або с
        [^abc] - будь-які символи, окрім а або b, або с
        [a-z] [A-Z] [0-9]


        X+ може бути 1 або може повторюватись скільки завгодно разів
        X* може не бути або може повторюватись скільки завгодно разів
        X{n} - n-разів
        X{n,m} [з n по m]
        X{n,}  - n>
        X? - 1 або відсутнє
        */


        String email = "vasya123.pypkin.asds_@kneu_2023.com.";

        String pattern2 = "[a-zA-Z]+[\\.\\w]+@[\\w]+[\\.\\w]+[\\a-zA-Z]{2,}";

        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(email);

        if (m2.matches()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}

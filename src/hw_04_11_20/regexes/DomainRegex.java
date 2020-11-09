package hw_04_11_20.regexes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainRegex {
    public static void main(String[] args) {
        String s = "http://example.com/";
        Pattern p = Pattern.compile("^([h][t][t][p][s]?:)//(\\w{2,})\\.([a-zA-Z]{2,6})/$");
        Matcher m = p.matcher(s);
        if (m.matches()) {
            System.out.println("Correct Domain name");
        } else {
            System.out.println("Incorrect Domain name");
        }
    }
}

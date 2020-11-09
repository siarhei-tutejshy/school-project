package hw_04_11_20.regexes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPRegex {
    public static void main(String[] args) {
        String s = "255.255.255.0";
        Pattern p = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher m = p.matcher(s);
        if (m.matches()) {
            System.out.println("IP address is correct");
        } else {
            System.out.println("Incorrect IP address");
        }
    }
}

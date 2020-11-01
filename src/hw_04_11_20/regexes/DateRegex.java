package hw_04_11_20.regexes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateRegex {
    public static void main(String[] args) {
        System.out.println("Enter the date (yyyy/mm/dd hh:mm:ss)");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        Pattern p = Pattern.compile("((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])\\s([01]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$");
        Matcher m = p.matcher(date);
        if (m.matches()) {
            System.out.println("Correct date");
        } else {
            System.out.println("Incorrect date");
        }
    }
}

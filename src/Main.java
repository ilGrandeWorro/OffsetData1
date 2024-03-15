package src;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateStringShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String dateStringMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateStringFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dateStringShort);
        System.out.println(dateStringMedium);
        System.out.println(dateStringFull);
    }
}

package FormatDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {
    public static String formatToFullText(LocalDateTime dateTime) {
        return "Le " +
                dateTime.getDayOfMonth() + " " +
                dateTime.getMonth() + " de l'an " +
                dateTime.getYear() + " à " +
                dateTime.getHour() + "h" +
                dateTime.getMinute() + "m et " +
                dateTime.getSecond();
    }

    public static String formatSimple(LocalDate date) {
        Locale locale = new Locale("es", "ES");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", locale);
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        return time.toString();
    }

}

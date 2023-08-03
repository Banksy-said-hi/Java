package Basic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Calendar {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);

        // Real month we are at
        Month currentMonth = today.getMonth();

        // Full date of the first day of the month we are at
        LocalDate firstDayOfMonth = today.withDayOfMonth(1);

        String[] daysOfWeek = { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };

        for (String dayOfWeek : daysOfWeek) {
            System.out.print(dayOfWeek + "  ");
        }
        System.out.println();

        int dayOfWeekValue = firstDayOfMonth.getDayOfWeek().getValue();
        for (int i = 0; i < dayOfWeekValue; i++) {
            System.out.print("    ");
        }

        LocalDate day = firstDayOfMonth;
        while (currentMonth.equals(day.getMonth())) {
            int dayOfMonth = day.getDayOfMonth();
            System.out.printf("%2d  ", dayOfMonth);

            if (day.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                System.out.println();
            }

            day = day.plusDays(1);
        }
    }
}

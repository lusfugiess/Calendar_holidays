package Calendar;

import java.time.Month;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String monthName = scanner.nextLine().trim().toLowerCase();
        Month month = null;

        try {
            month = Month.valueOf(monthName.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month name: " + monthName);
            System.exit(1);
        }

        Holiday[] holidays = LatvianHolidayData.publicHolidays;
        int count = 0;

        System.out.println("Holidays in " + month + " 2023:");
        for (Holiday holiday : holidays) {
            if (holiday.getDate().getMonth() == month) {
                count++;
                System.out.println(holiday.getGlobalName() + " (" + holiday.getDate() + ")");
            }
        }
        if (count == 0) {
            System.out.println("No holidays found in " + monthName);
        }

    }
}

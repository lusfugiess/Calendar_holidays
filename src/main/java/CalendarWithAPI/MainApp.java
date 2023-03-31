package CalendarWithAPI;

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

        HolidayApi api = new HolidayApi();
        Holiday[] holidays = api.getHolidays(2023, "LV");
        int count = 0;

        System.out.println("Holidays in " + month + " 2023:");
        for (Holiday holiday : holidays) {
            if (holiday.isInMonth(monthName)) {
                count++;
                System.out.println(holiday.getName() + " (" + holiday.getDate() + ")");
            }
        }
        if (count == 0) {
            System.out.println("No holidays found in " + monthName);
        }
    }
}

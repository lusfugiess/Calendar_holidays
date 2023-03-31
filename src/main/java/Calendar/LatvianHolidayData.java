package Calendar;

import java.time.LocalDate;

class LatvianHolidayData {
    public static Holiday[] publicHolidays = {
            new Holiday("New Year's Day", LocalDate.of(2023, 1, 1), "Jaunais Gads", ""),
            new Holiday("Good Friday", LocalDate.of(2023, 4, 14), "Lielā Piektdiena", ""),
            new Holiday("Easter Monday", LocalDate.of(2023, 4, 17), "Otrās Lieldienas", ""),
            new Holiday("Labour Day", LocalDate.of(2023, 5, 1), "Darba svētki", "The convocation of the constitutional assembly in 1920 also falls on May 1 and is also celebrated on this day."),
            new Holiday("Restoration of Independence Day", LocalDate.of(2023, 5, 4), "Latvijas Republikas Neatkarības atjaunošanas diena", "On 4 May 1990. Latvia proclaimed its independence from the USSR, and restoration of the Republic of Latvia. If the day is on the weekend the next Monday is a holiday."),
            new Holiday("Midsummer's Eve", LocalDate.of(2023, 6, 23), "Līgo diena", ""),
            new Holiday("Midsummer's Day", LocalDate.of(2023, 6, 24), "Jāņi", ""),
            new Holiday("Proclamation Day of the Republic of Latvia", LocalDate.of(2023, 11, 18), "Latvijas Republikas proklamēšanas diena", "The independence of Latvia was proclaimed on this day in 1918. If the day is on the weekend the next Monday is a holiday."),
            new Holiday("Christmas Eve", LocalDate.of(2023, 12, 24), "Ziemassvētku vakars", "This is when gifts are traditionally exchanged, usually children must offer a poem or song to receive their gift. Families still use real candles on their trees."),
            new Holiday("Christmas Day", LocalDate.of(2023, 12, 25), "Ziemassvētki", ""),
            new Holiday("Second Day of Christmas", LocalDate.of(2023, 12, 26), "Otrie Ziemassvētki", ""),
            new Holiday("New Year's Eve", LocalDate.of(2023, 12, 31), "Vecgada vakars", "")
    };
}

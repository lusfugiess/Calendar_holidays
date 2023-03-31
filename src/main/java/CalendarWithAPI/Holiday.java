package CalendarWithAPI;

public class Holiday {
    private String name;
    private String date;

    public Holiday(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public boolean isInMonth(String month) {
        String[] dateParts = date.split("-");
        int monthNumber = Integer.parseInt(dateParts[1]);
        String monthName = getMonthName(monthNumber);
        return month.equalsIgnoreCase(monthName);
    }

    private static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }
}

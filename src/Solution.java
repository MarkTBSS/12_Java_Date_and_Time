import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        int month = Integer.parseInt("08");
        int day = Integer.parseInt("05");
        int year = Integer.parseInt("2015");
        String res = Result.findDay(month, day, year);
        System.out.println(res);
    }
}

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar aiyaCalendar = Calendar.getInstance();
        aiyaCalendar.set(Calendar.MONTH, month - 1);
        aiyaCalendar.set(Calendar.DAY_OF_MONTH, day);
        aiyaCalendar.set(Calendar.YEAR, year);
        int monthCheck = aiyaCalendar.get(Calendar.MONTH);
        int dayCheck = aiyaCalendar.get(Calendar.DATE);
        int yearCheck = aiyaCalendar.get(Calendar.YEAR);
        int datOfWeekCheck = aiyaCalendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(monthCheck);
        System.out.println(dayCheck);
        System.out.println(yearCheck);
        System.out.println(datOfWeekCheck);
        String[] dayNames = {
            "SUNDAY", 
            "MONDAY", 
            "TUESDAY", 
            "WEDNESDAY", 
            "THURSDAY", 
            "FRIDAY", 
            "SATURDAY"
        };
        String aiyaString = dayNames[datOfWeekCheck - 1];
        return aiyaString;
    }
}
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Utils {
    /**
     *This method is for validating the city that is entered.
     */
    public boolean isValidCity(String city)
    {
        char[] chars = city.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if (!(chars[i] >= 'a' && chars[i] <= 'z'))
            {
                return false;
            }
        }
        return true;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     *This method is used to detect that the origin and destination are different.
     */
    public boolean isValidDestination(String origin , String destination)
    {
        if (destination.equals(origin))
        {
            return false;
        }else
        {
            return true;
        }
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     *This method is for detecting a number from a string.
     */
    public boolean isValidNumber(String num)
    {
        char[] chars = num.toLowerCase().toCharArray();
        for (int i = 0; i < num.length(); i++) {
            if (!(chars[i] >= '0' && chars[i] <= '9'))
            {
                return false;
            }
        }
        return true;
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     *This method is used to detect the validity of the range.
     */
    public boolean isValidRange(int lowPrice , int upPrice)
    {
        if (lowPrice > upPrice)
        {
            return false;
        }else
        {
            return true;
        }
    }
    //-------------------------------------------------------------------------------------------------------------------

    /**
     *This method is used to detect the validity of the time.
     */
    public boolean isValid24HourTime(String input) {

        String regex = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    //------------------------------------------------------------------------------------------------------------------

    /**
     *This method is used to check the validity of the day.
     */
    public boolean isValidDate(String input) {
        String pattern = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        try {
            LocalDate date = LocalDate.parse(input, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
//    public static void main(String[] args) {
////        String time1 = "09:30";
////        String time2 = "18:45";
////        String time3 = "25:00";
////        String time4 = "09:70";
////
////        System.out.println(time1 + " is valid? " + isValid24HourTime(time1));
////        System.out.println(time2 + " is valid? " + isValid24HourTime(time2));
////        System.out.println(time3 + " is valid? " + isValid24HourTime(time3));
////        System.out.println(time4 + " is valid? " + isValid24HourTime(time4));
//        String date1 = "2021-09-15";
//        String date2 = "2022-02-30";
//        String date3 = "2023/04/12";
//        String date4 = "1399-12-31";
//
//        System.out.println(date1 + " is valid? " + isValidDate(date1));
//        System.out.println(date2 + " is valid? " + isValidDate(date2));
//        System.out.println(date3 + " is valid? " + isValidDate(date3));
//        System.out.println(date4 + " is valid? " + isValidDate(date4));
//    }
}

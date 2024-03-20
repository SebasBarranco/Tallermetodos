
public class Exercise5 {

    public static double convertSecondsToDaysHoursMinutes(double seconds, String type) {
        if (type.equalsIgnoreCase("days")) {
            return seconds / (24 * 3600);
        } else if (type.equalsIgnoreCase("hours")) {
            return seconds / 3600;
        } else if (type.equalsIgnoreCase("minutes")) {
            return seconds / 60;
        } else {
            return -1;
        }
    }
}

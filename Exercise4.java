
public class Exercise4 {

    public static double calculateCirclePerimeterAreaVolume(double radius, String calculationType) {
        final double PI = 3.1416;
        if (calculationType.equalsIgnoreCase("perimeter")) {
            return 2 * PI * radius;
        } else if (calculationType.equalsIgnoreCase("area")) {
            return PI * radius * radius;
        } else if (calculationType.equalsIgnoreCase("volume")) {
            return (4 * PI * radius * radius * radius) / 3;
        } else {
            return -1;
        }
    }
}


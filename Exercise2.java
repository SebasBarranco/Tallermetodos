
public class Exercise2 {

    public static double calculateRectangle(double side1, double side2, String calculationType) {
        if (calculationType.equalsIgnoreCase("perimeter")) {
            return 2 * (side1 + side2);
        } else if (calculationType.equalsIgnoreCase("area")) {
            return side1 * side2;
        } else {
            return -1;
        }
    }
}



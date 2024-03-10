package edu.uoc.ds.adt;

public class TestUtils {

    /**
     * Generates and retunrs a String that contains the sin value of the angles from 0 to 360 split by a whitespace
     * character {@code ' '}.
     * @return a String that contains the sin value of the angles from 0 to 360
     */
    public static String getSinValues() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 360; i++) {
            sb.append(Math.sin(Math.toRadians(i))).append(' ');
        }
        return sb.toString();
    }
}

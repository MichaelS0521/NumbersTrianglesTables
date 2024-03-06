package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            sb.append(getRow(i)+"\n");
        }
        return sb.toString();
    }


    public static String getRow(int width) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            sb.append("*");
        }
        return sb.toString();
    }


    public static String getSmallTriangle() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            sb.append(getRow(i)).append("\n");
        }
        return sb.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            sb.append(getRow(i)).append("\n");
        }
        return sb.toString();
    }
}

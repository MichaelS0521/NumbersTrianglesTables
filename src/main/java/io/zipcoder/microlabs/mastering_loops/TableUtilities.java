package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int n = 1; n <= 5; n++) {
                int total = i * n;
                table.append(String.format("%3d |", total));
            }
            table.append("\n");
        }
        return table.toString();
    }


    public static String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= 10; n++) {
                int total = i * n;
                table.append(String.format("%3d |", total));
            }
            table.append("\n");
        }
        return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int n = 1; n <= tableSize; n++) {
                int total = i * n;
                table.append(String.format("%3d |", total));
            }
            table.append("\n");
        }
        return table.toString();
    }
}

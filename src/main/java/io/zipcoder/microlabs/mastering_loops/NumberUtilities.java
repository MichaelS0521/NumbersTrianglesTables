package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += 1) {
            if (!isOdd(i)){     //! is not odd
                sb.append(i);
            }
        }
        return sb.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += 1) {
            if (isOdd(i)){
                sb.append(i);
            }
        }
        return sb.toString();
    }

    private static boolean isOdd(int n) {
        return !((n % 2) == 0);
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            sb.append(i * i);
        }
        return sb.toString();
    }

    public static String getRange(int stop) {       //changed start to stop.
//        String result = "";
//        for (int i = 0; i < start; i++) {
//            if(i >= start){
//                break;
//            }
//
//            result = result + i;
//        }
//
//        return result;
        return getRange(0 , stop , 1);
    }

    public static String getRange(int start, int stop) {
//        String result = "";
//        for (int i = start; i < stop; i++) {
//            if(i == stop){
//                break;
//            }
//
//            result = result + i;
//        }
//        return result;
        return getRange(start, stop , 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += step){
            sb.append(i);
        }
//        String result = "";
//        for (step = start; step < stop; step++) {
//            if(step == stop){
//                break;
//            }
//
//            result = result + step;
//        }
//        return result;
        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            sb.append((int) Math.pow(i, exponent));
        }
        return sb.toString();
    }
}

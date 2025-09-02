package fundamentals.types;

import java.util.Arrays;
import java.util.Date;

public class ArrayDefaultValues {
    public static void main(String[] args) {

        byte[] ages = new byte[3];
        System.out.println(Arrays.toString(ages));

        short[] ids = new short[3];
        System.out.println(Arrays.toString(ids));

        int[] ranks = new int[3];
        System.out.println(Arrays.toString(ranks));

        long[] factorials = new long[3];
        System.out.println(Arrays.toString(factorials));

        float[] prices = new float[3];
        System.out.println(Arrays.toString(prices));

        double[] percentiles = new double[3];
        System.out.println(Arrays.toString(percentiles));

        char[] letters = new char[3];
        // default value: "\u0000"
        System.out.println(Arrays.toString(letters));

        boolean[] isPassedTests = new boolean[3];
        System.out.println(Arrays.toString(isPassedTests));

        // null
        String[] cities = new String[3];
        cities[0] = "Nanded";
        System.out.println(Arrays.toString(cities));

        Date[] dates = new Date[3];
        System.out.println(Arrays.toString(dates));

    }
}

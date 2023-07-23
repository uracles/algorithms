package com.Algorithms.Uracles;

import java.util.ArrayList;
import java.util.List;

public class ArrayAverage {

    /**
     * Write a function which calculates the average of the numbers in a given list.
     * Note: Empty arrays should return 0.
     **/
    public static double find_average(int[] array) {

        double sum = 0;
        for (int num : array)
            sum += num;
        return sum / array.length;

        * Write a function which calculates the average of the numbers in a given list.
     * Note: Empty arrays should return 0.
     **/
    }
}



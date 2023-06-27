package com.Algorithms.Uracles;

import java.util.*;

public class canArrangeClassPhoto {
   /** It's photo day at the local school, and you're the photographer assigned to take class photos. The class that you'll be photographing has an even number of students, and all these students are wearing red or blue shirts. In fact, exactly half of the class is wearing red shirts, and the other half is wearing blue shirts. You're responsible for arranging the students in two rows before taking the photo. Each row should contain the same number of the students and should adhere to the following guidelines:

    All students wearing red shirts must be in the same row.
    All students wearing blue shirts must be in the same row.
    Each student in the back row must be strictly taller than the student directly in front of them in the front row.
    You're given two input arrays: one containing the heights of all the students with red shirts and another one containing the heights of all the students with blue shirts. These arrays will always have the same length, and each height will be a positive integer.

    Write a function that returns whether or not a class photo that follows the stated guidelines can be taken.

    Note: you can assume that each class has at least 2 students.

            Sample Input
    redShirtHeights = [5, 8, 1, 3, 4]
    blueShirtHeights = [6, 9, 2, 4, 5]
    **/


   public static boolean canArrangeClassPhoto(int[] redShirtHeights, int[] blueShirtHeights) {
       int n = redShirtHeights.length;

       // Sort the arrays in ascending order
       Arrays.sort(redShirtHeights);
       Arrays.sort(blueShirtHeights);

       // Check if the first student in each row violates the height requirement
       if (redShirtHeights[0] <= blueShirtHeights[0]) {
           return false;
       }

       // Check the remaining students in each row
       for (int i = 1; i < n; i++) {
           if (redShirtHeights[i] <= blueShirtHeights[i] || redShirtHeights[i-1] <= blueShirtHeights[i-1]) {
               return false;
           }
       }

       return true;
   }

    public static void main(String[] args) {
    int[] redShirtHeights = {5, 8, 1, 3, 4};
    int[] blueShirtHeights = {6, 9, 2, 4, 5};

    boolean canArrange = canArrangeClassPhoto(redShirtHeights, blueShirtHeights);
        System.out.println("Can arrange class photo: " + canArrange);
}

}

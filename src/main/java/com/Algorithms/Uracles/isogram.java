package com.Algorithms.Uracles;

public class Isogram {


    /**An isogram is a word that has no repeating letters, consecutive or non-consecutive.
     * Implement a function that determines whether a string that contains only letters is an isogram.
     * Assume the empty string is an isogram. Ignore letter case.

    Example: (Input --> Output)

            "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

    isIsogram "Dermatoglyphics" = true
    isIsogram "moose" = false
    isIsogram "aba" = false
    **/

    public static boolean isIsogram(String str) {
        // Convert the string to lowercase to ignore letter case
        str = str.toLowerCase();

        // Create an array to keep track of letter occurrences
        boolean[] visited = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the current character is a letter
            if (Character.isLetter(c)) {
                // Calculate the index of the letter in the array (a:0, b:1, ..., z:25)
                int index = c - 'a';

                // If the letter has already been visited, it's not an isogram
                if (visited[index]) {
                    return false;
                }

                // Mark the letter as visited
                visited[index] = true;
            }
        }

        // If we reach this point, the string is an isogram
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics")); // true
        System.out.println(isIsogram("moose")); // false
        System.out.println(isIsogram("aba")); // false
    }
}


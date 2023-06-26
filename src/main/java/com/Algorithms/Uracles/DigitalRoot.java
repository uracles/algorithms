package com.Algorithms.Uracles;

public class DigitalRoot {
    /**Digital root is the recursive sum of all the digits in a number.
    Given n, take the sum of the digits of n. If that value has more than one digit,
     continue reducing in this way until a single-digit number is produced.
     The input will be a non-negative integer.

    Examples
    16  -->  1 + 6 = 7
     942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
     **/

        public static int digital_root(int n) {
            // ...
            while (n > 9) {
                int sum = 0;
                while (n != 0) {
                    sum += n % 10;
                    n /= 10;
                }
                n = sum;
            }
            return n;
        }
    }



package com.Algorithms.Uracles;

public class SumNumbers {
// Given two integers a and b, which can be positive or negative, find the sum of all the numbers
// between including them too and return it. If the two numbers are equal return a or b
// Note: a and b are not ordered!

        public int getSum(int a, int b) {
            int result = 0;


            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                result += i;
            }

            return result;
        }

    public static void main(String[] args) {
        int a = 2;
        int b = 6;

        SumNumbers sumNumbers = new SumNumbers();
        int sum = sumNumbers.getSum(a, b);
        System.out.println("Sum: " + sum);
    }
}


package com.Algorithms.Uracles;

public class FibonacciSeries {
    //show all the fibonacci sequence between 1 and 100
        public static void main(String[] args) {
            int i = 1, n = 100, firstNum = 0, secondNum = 1;

            while (i <= n) {
                int nextNum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = nextNum;

                i++;
                return ;
            }
            System.out.println(firstNum + ",");
        }

//    public static void main(String[] args) {
//
//        int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
//        System.out.println("Fibonacci Series till " + n + " terms:");
//
//        while (i <= n) {
//            System.out.print(firstTerm + ", ");
//
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//
//            i++;
//        }
//    }
}



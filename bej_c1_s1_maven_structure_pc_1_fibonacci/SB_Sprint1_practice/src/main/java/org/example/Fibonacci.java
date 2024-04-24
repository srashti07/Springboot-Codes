package org.example;

public class Fibonacci {
    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input should be a positive integer");
        }

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int firstTerm = 0, secondTerm = 1, nextTerm = 0;

            for (int i = 3; i <= n; i++) {
                nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }

            return nextTerm;
        }
    }

}

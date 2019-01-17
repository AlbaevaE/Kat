package com.company;

public class Main {

    public static void main(String[] args) {
        int[] N = new int[]{1, 2, 3, 2, 888, 6, 7, 8, 9, 10, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(printEvenNumbers(N));
        System.out.println(printSum(N));
        System.out.println(printNextTwo(N));


    }

    public static int printEvenNumbers(int[] M) {
        int countK = 0;
        for (int i = 0; i < M.length; i++) {
            if (M[i] % 2 == 0) {
                countK++;


            }
        }

        return countK;

    }

    public static int printSum(int[] S) {
        int sum = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i] < 13) {
                sum += S[i];
            }
        }
        return sum;
    }

    public static boolean printNextTwo(int[] B) {
        boolean next = false;
        for (int i = 0; i < B.length - 1; i++) {
            if (2 == B[i + 1]) {

                next = true;
            } else {
                next = false;
            }
        }
        return next;
    }
}


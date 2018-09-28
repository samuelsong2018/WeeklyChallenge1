package me.samuel;

import java.util.Scanner;

//public class Main {
//
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any positive integer:");
//        int input = scan.nextInt();
//        int i, factorial = 1;
//        for (i = 1; i <= input; i++) {
//            factorial = factorial * i;
//        }
//        System.out.println("Factorial of " + input + " is: " + factorial);
//    }
//}

public class Main {

//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any positive integer:");
//        int i = scan.nextInt();
//        for (i = 1; i <= input; i++) {
//
//        }
//        if (n % 2 == 0)
//            collatz(i / 2);
//        else
//            collatz(3 * i + 1);
//    }
//}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive integer:");
        int i = scan.nextInt();
    }

    private static void collatz(int n) {
        int i = 0;
        // The following has to occur inside a loop or it'll only occur once
        while (n > 1)
        {
            // The following is what's known as "ternary form" - if the first statement is true, it'll assign the first value. Otherwise it assigns the first value.
            // For example,
            // int a = (1 == 2 ? 10 : 20);
            // will equal 20
            n = (n % 2 == 0 ?
                    (n / 2) : // This value will be assigned if n is even
                    (3 * n + 1)); // This value will be assigned if n is odd
            i++;
        }
        System.out.println(i);}}
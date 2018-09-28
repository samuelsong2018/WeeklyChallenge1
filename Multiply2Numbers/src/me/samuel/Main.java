package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive integer:");
        int num1 = scan.nextInt();
        System.out.println("Enter another positive integer: ");
        int num2 = scan.nextInt();
        System.out.println("The product of these two integers is: "+ "\n" + (num1*num2));
    }
}
package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive integer:");

        //Capture the input as an integer.
        int num = scan.nextInt();
        for(int firstNumber=1; num>=firstNumber; firstNumber++) {
            { boolean isPrime=true;
                int i=2;
                while(i<= firstNumber/2) {
                    if(firstNumber % i == 0) {
                        isPrime = false;
                        break; }
                    i++; }

                //If isPrime is true, then the number is prime. Otherwise, number is not prime.
                if (isPrime)
                    System.out.println(firstNumber + " is a prime number!");
                else
                    System.out.println(firstNumber + " is not a prime number.");
            }
        }
    }
}
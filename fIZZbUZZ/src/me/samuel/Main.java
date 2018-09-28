package me.samuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = getMaxNum();
        printFizzBuzz(max);
    }

    private static int getMaxNum(){
        Scanner in = new Scanner(System.in);
        int max = 0;

        System.out.printf("Enter max number to print to: ");
        max = in.nextInt();

        return max;
    }

    private static void printFizzBuzz(int max) {
        String output;

        for(int i=1; i<=max; i++) {
            output = "";

            if(i%3 == 0){
                output += "Fizz";
            }

            if(i%5 == 0) {
                output += "Buzz";
            }

            if(output.equals("")){
                System.out.println(i);
            }
            else {
                System.out.println(output);
            }
        }
    }
}

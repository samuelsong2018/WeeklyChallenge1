package me.samuel;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Your name is: "+ name+" Your age is: " + age);


    }

    public static int DivideBy5 (int theInteger){
        int input = theInteger/5;
        return input;
    }
}

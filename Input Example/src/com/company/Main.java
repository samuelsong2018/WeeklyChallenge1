package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	    Scanner keyboard = new Scanner(System.in);

	    System.out.println("Enter the first value:");
	    String myFirstString = keyboard.next();
	    keyboard.nextLine();
	    System.out.println(myFirstString);
        System.out.println("Enter the second value:");
	    String secondString = keyboard.nextLine();
	    System.out.println("First String: " +myFirstString + "\nSecond String: " + secondString);

    }
}

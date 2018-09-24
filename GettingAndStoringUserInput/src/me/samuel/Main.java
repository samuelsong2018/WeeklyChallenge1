package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("First initial: ");
        String myFirstInitial = keyboard.nextLine();
        System.out.println("Last name: ");
        String myLastName = keyboard.nextLine();
        System.out.println("House number: ");
        String houseNumber = keyboard.nextLine();
        System.out.println("Street name: ");
        String streetName = keyboard.nextLine();
        System.out.println("Street type: ");
        String streetType = keyboard.nextLine();
        System.out.println("City: ");
        String city = keyboard.nextLine();
        System.out.println("Your mailing address is: " + myFirstInitial + ". " + myLastName + " " + houseNumber + " " + streetName + " " + streetType + " " + city);
    }
}
package me.samuel;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person theParent = new Person();
        theParent.setName("Afua");

        System.out.println("How many children do you want to add? ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.nextLine();

        //New variable in for loop
        for (int count = 0; count < number; count++) {
            System.out.println("Who are you adding? ");
            String childName = input.nextLine();

            //Creating new person
            Person childOfTheParent = new Person();
            childOfTheParent.setName(childName);
            theParent.addAChild(childOfTheParent);
        }

    ArrayList<String> theirNames = new ArrayList<>();
        for (Person eachChild : theParent.getMyChildren()) {

        theirNames.add(eachChild.getName());
        System.out.println(theParent.getName() + "'s child is " + eachChild.getName());
    }

        Collections.sort(theirNames);
        System.out.println("Sorted Names:\n");
        for (String aName : theirNames) {
        System.out.println(aName);
    }


}
}
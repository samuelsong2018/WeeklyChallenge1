package me.samuel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Limits the kind of object that can be listed; here, accepts custom object 'Person'.
        ArrayList<Person>persons = new ArrayList<>();

        //Creating a custom function
        String addPerson = "";

        do {
            //Instantiating thePerson object to give attributes to. Giving attributes is done with setters.
            Person thePerson= new Person();

            //Ask person for name, then store name as a string object.
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String yourName = input.nextLine();
            //This is where you use the setter method!
            thePerson.setName(yourName);

            // Ask for email, then store email.
            System.out.println("Enter your email: ");
            String yourEmail = input.nextLine();
            thePerson.setEmail(yourEmail);

            // Ask for fav. color, then store fav. color.
            System.out.println("Enter your favorite color: ");
            String yourFavColor = input.nextLine();
            System.out.println(yourFavColor);
            thePerson.setFavoriteColor(yourFavColor);

            System.out.printf("Your name is %s, your e-mail address is %s, and your favorite color is %s.", thePerson.getName(), thePerson.getEmail(), thePerson.getFavoriteColor());

            System.out.println("\nDo you want to add another person? ");
            addPerson = input.nextLine();

            //Keeps track of everyone entered into the program, so then we can display this list, if we want to.
            persons.add(thePerson);

        } while (addPerson.equalsIgnoreCase("yes")||addPerson.equalsIgnoreCase("y"));

        //This loop displays all info entered into program.
        for(Person item:persons){
            System.out.println(item.getName()+ " "+item.getEmail()+" " +item.getFavoriteColor());
        }
    }
}
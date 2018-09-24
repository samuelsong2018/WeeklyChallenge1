package me.samuel;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String yourName = keyboard.next();
        System.out.println("Hello, " +yourName+ "!"+ "\nNice to meet you!");
        System.out.println("How old are you?");
        String yourAge = keyboard.next();
        System.out.println("Oh, I see. You are " +yourAge+ " years old."+"\n*sips tea* ");
    }
}
